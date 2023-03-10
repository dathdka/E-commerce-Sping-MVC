package DiamonShop.AdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.SanPham;
import DiamonShop.Entity.TaiKhoan;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class AdminSPController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = { "/admin/product" })
	public ModelAndView Product() {
    	ModelAndView mv = new ModelAndView("admin/product");
    	List<SanPham> list = HomeService.GetDataSanPham();
    	mv.addObject("list",list);
		return mv;
    }
	
	@RequestMapping(value = { "/admin/updateproduct/{id}" })
	public  ModelAndView update(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("admin/updateproduct");
		SanPham sp = new SanPham();
		sp.setMasp(id);
		mv.addObject("sp", sp );
		return mv;
	}
	
	@RequestMapping(value = { "/admin/updateproduct/update"})
    public ModelAndView updateproduct(@ModelAttribute("sp") SanPham sp) {
    	ModelAndView mv = new ModelAndView("admin/product");
    	HomeService.updateProduct(sp);
    	mv.addObject("TrangThai", "Thanh cong");
		return mv;
    }
	
	@RequestMapping(value = { "/admin/addproduct" })
	public  ModelAndView add() {
		ModelAndView mv = new ModelAndView("admin/addproduct");
		mv.addObject("sp", new SanPham() );
		return mv;
	}
	
	@RequestMapping(value = { "/admin/add"})
    public ModelAndView addproduct(@ModelAttribute("sp") SanPham sp) {
    	ModelAndView mv = new ModelAndView("admin/product");
    	HomeService.addproduct(sp);
		return mv;
    }
}
