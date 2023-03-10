package DiamonShop.AdminController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.LoaiSP;
import DiamonShop.Entity.SanPham;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class AdminHomeController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = { "/admin", "/admin/home" })
	public ModelAndView Index(HttpSession session) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				mv.setViewName("admin/index");

				
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
	
	@RequestMapping(value = { "/admin/category" })
	public ModelAndView category(HttpSession session) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				mv.setViewName("admin/category");
				List<LoaiSP> list = HomeService.GetDataLoaiSP();
				mv.addObject("list",list);
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
	
	@RequestMapping(value = { "/admin/addcategory" })
	public ModelAndView addcate(HttpSession session) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				mv.setViewName("admin/addcategory");
				mv.addObject("lsp", new LoaiSP());
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
	
	@RequestMapping(value = { "/admin/addcate" })
	public ModelAndView addCategory(HttpSession session, @ModelAttribute("lsp") LoaiSP lsp) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				HomeService.addcategory(lsp);
				mv.setViewName("admin/category");
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
	
	@RequestMapping(value = { "/admin/updatecate/{id}" })
	public ModelAndView updatecate(HttpSession session,@PathVariable int id ) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				mv.setViewName("admin/updatecategory");
				LoaiSP lsp = new LoaiSP();
				lsp.setMalsp(id);
				mv.addObject("lsp", lsp);
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
	
	@RequestMapping(value = { "/admin/updatecate/updatecate" })
	public ModelAndView donecate(HttpSession session,@ModelAttribute("lsp") LoaiSP lsp ) {
		ModelAndView mv = new ModelAndView("user/index");
		if(session.getAttribute("user")!=null) {
			String email = session.getAttribute("user").toString();
			if(HomeService.checkAdmin(email)) {
				mv.setViewName("admin/category");
				HomeService.updatecate(lsp);
			}else {
				mv.addObject("TrangThai", "Ko phai admin");
			}
		}else {
			mv.addObject("TrangThai", "Hay dang nhap");
		}
		return mv;
	}
}
