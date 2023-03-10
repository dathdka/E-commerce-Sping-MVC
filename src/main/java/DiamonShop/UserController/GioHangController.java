package DiamonShop.UserController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.SanPham;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class GioHangController {
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value = {"/addtocart/{id}"})
	public ModelAndView addcart(@PathVariable int id,HttpSession session) {
		ModelAndView mv = new ModelAndView("redirect:/product");
		if(session.getAttribute("user")!=null) {
			String user = session.getAttribute("user").toString();
			mv.addObject("TrangThai", HomeService.AddToCart(id, user));
		}else {
			mv = new ModelAndView("redirect:/login");
		}
		return mv;
	}
	
	@RequestMapping(value = "/cart")
	public ModelAndView cart (HttpSession session) {
		ModelAndView mv = new ModelAndView("user/cart");
		String userid = session.getAttribute("user").toString();
		mv.addObject("giohang", HomeService.GetCart(userid));
		List<SanPham> list = HomeService.GetCart(userid);
		int TongTien = 0;
		for(SanPham item : list) {
			if(item.getKhuyenmai()>0)
				TongTien+= item.getDongia() - (item.getDongia() *item.getKhuyenmai())/100;
			else
				TongTien += item.getDongia();
		}
		mv.addObject("tong", TongTien);
		return mv;
	}
	
	@RequestMapping(value = "/removecart/{id}")
	public ModelAndView removecart (@PathVariable int id,HttpSession session) {
		ModelAndView mv = new ModelAndView("redirect:/cart");
		String userid = session.getAttribute("user").toString();
		HomeService.RemoveCart(id,userid);
		return mv;
	}
	
	@RequestMapping(value = "/checkout")
	public ModelAndView payment (HttpSession session) {
		ModelAndView mv = new ModelAndView("user/payment");
		String useremail = session.getAttribute("user").toString();
		int tongtien = HomeService.payment(useremail);
		mv.addObject("tongtien", tongtien);
		return mv;
	}
	
	@RequestMapping(value = "/confirm/{id}")
	public ModelAndView saveorder(@PathVariable int id,HttpSession session) {
		ModelAndView mv = new ModelAndView("redirect:/");
		String useremail = session.getAttribute("user").toString();
		HomeService.savepayment(id,useremail);
		return mv;
	}
}
