package DiamonShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class SanPhamController {
	@Autowired
	HomeServiceImpl HomeService;
	
    @RequestMapping(value = {"/product/{id}"})
    public ModelAndView Product(@PathVariable int id) {
    	ModelAndView mv = new ModelAndView();
		mv.addObject("SanPham", HomeService.GetDataSanPhamByLoaiSP(id));
		mv.setViewName("/user/product");
		return mv;
    }
    
    @RequestMapping(value = { "/productdetail/{id}"})
    public ModelAndView ProductDetail(@PathVariable int id) {
    	ModelAndView mv = new ModelAndView("user/productdetail");
		mv.addObject("SanPham", HomeService.GetDataSingleSanPham(id));
		return mv;
    }
    
    @RequestMapping(value = { "/product"})
    public ModelAndView Product() {
    	ModelAndView mv = new ModelAndView("user/product");
		mv.addObject("SanPham", HomeService.GetDataSanPham());
		return mv;
    }
    
    
    
    
    
    @RequestMapping(value = "/product?search={id}")
    public ModelAndView Product(String id) {
    	ModelAndView mv = new ModelAndView("user/product");
    	if(id == null)
    		mv.addObject("key", "ko co");
    	else
    		mv.addObject("key", "co");
    	return mv;
    }
}