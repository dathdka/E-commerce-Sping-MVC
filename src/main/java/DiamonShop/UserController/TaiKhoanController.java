package DiamonShop.UserController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.TaiKhoan;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class TaiKhoanController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = { "/register"},method = RequestMethod.GET)
    public ModelAndView register() {
    	ModelAndView mv = new ModelAndView("user/register");
    	mv.addObject("TK", new TaiKhoan());
		return mv;
    }
	
	@RequestMapping(value = { "/register"},method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("TK") TaiKhoan TK) {
    	ModelAndView mv = new ModelAndView("user/register");
    	HomeService.addAccount(TK);
    	mv.addObject("TrangThai", "Thanh cong");
		return mv;
    }
	
	@RequestMapping(value = { "/login"},method = RequestMethod.GET)
    public ModelAndView login() {
    	ModelAndView mv = new ModelAndView("user/login");
    	mv.addObject("TK", new TaiKhoan());
		return mv;
    }
	@RequestMapping(value = { "/login"},method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("TK") TaiKhoan TK, HttpSession session) {
    	ModelAndView mv = new ModelAndView("user/login");
    	boolean check = HomeService.checkLogin(TK);
    	if(check) {
    		mv = new ModelAndView("user/index");
    		session.setAttribute("user", TK.getEmail());
    		String s = session.getAttribute("user").toString();
    		mv.addObject("TrangThai", s);
    		
    	}
    	else {
    		mv.addObject("TrangThai", "That bai");
    	}
		return mv;
    }
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session) {
		session.setAttribute("user", null);
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
	}
	
	@RequestMapping(value = "/profile")
	public ModelAndView profile(HttpSession session) {
		String useremail = session.getAttribute("user").toString();
		ModelAndView mv = new ModelAndView("user/profile");
		TaiKhoan tk = HomeService.getUser(useremail);
		mv.addObject("tk",tk);
		return mv;
	}
	
	
}
