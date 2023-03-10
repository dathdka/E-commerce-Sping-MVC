package DiamonShop.UserController;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import DiamonShop.Service.User.HomeServiceImpl;


@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = { "/", "/home" })
    public ModelAndView Index(HttpSession session) {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", HomeService.GetDataSlide());
		mv.addObject("LoaiSP", HomeService.GetDataLoaiSP());
		return mv;
    }
	 

	
	@RequestMapping(value = "/about")
	public ModelAndView About() {
		return new ModelAndView("user/about");
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView Contact() {
		return new ModelAndView("user/contact");
	}
	
	
}