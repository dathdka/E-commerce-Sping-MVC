package DiamonShop.AdminController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.CT_DDH;
import DiamonShop.Entity.DonDH;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class AdminDonDHController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = "/admin/history")
	public ModelAndView history (HttpSession session) {
		ModelAndView mv = new ModelAndView("admin/history");
		List<DonDH> list = HomeService.getDonDH();
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value = "/admin/historydetail/{id}")
	public ModelAndView historydetail(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("admin/historydetail");
		List<CT_DDH> list = HomeService.getCT_DDH(id);
		for (CT_DDH item : list) {
			item.setSp( HomeService.GetDataSingleSanPham(item.getMasp()));
		}
		mv.addObject("list",list);
		return mv;
	}
}
