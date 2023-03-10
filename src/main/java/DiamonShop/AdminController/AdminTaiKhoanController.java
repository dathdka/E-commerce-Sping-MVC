package DiamonShop.AdminController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.TaiKhoan;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class AdminTaiKhoanController {
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value = { "/admin/login"},method = RequestMethod.GET)
    public ModelAndView login() {
    	ModelAndView mv = new ModelAndView("user/login");
    	mv.addObject("TK", new TaiKhoan());
		return mv;
    }
	@RequestMapping(value = { "/admin/login"},method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("TK") TaiKhoan TK, HttpSession session) {
    	ModelAndView mv = new ModelAndView("user/login");
    	boolean check = HomeService.checkLoginAdmin(TK);
    	if(check) {
    		mv = new ModelAndView("redirect:/admin");
    		session.setAttribute("user", TK.getEmail());
    		String s = session.getAttribute("user").toString();
    		mv.addObject("TrangThai", s);
    	}
    	else {
    		mv.addObject("TrangThai", "That bai");
    	}
		return mv;
    }
}
