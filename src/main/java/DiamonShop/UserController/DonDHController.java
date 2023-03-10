package DiamonShop.UserController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.CT_DDH;
import DiamonShop.Entity.DonDH;
import DiamonShop.Entity.SanPham;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class DonDHController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = "/history")
	public ModelAndView history (HttpSession session) {
		ModelAndView mv = new ModelAndView("user/history");
		String useremail = session.getAttribute("user").toString();
		List<DonDH> list = HomeService.getDonDH(useremail);
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value = "/historydetail/{id}")
	public ModelAndView historydetail(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("user/historydetail");
		List<CT_DDH> list = HomeService.getCT_DDH(id);
		for (CT_DDH item : list) {
			item.setSp( HomeService.GetDataSingleSanPham(item.getMasp()));
		}
		mv.addObject("list",list);
		return mv;
	}
}
