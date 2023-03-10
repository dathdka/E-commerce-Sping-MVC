package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DiamonShop.Dao.SanPhamDao;
import DiamonShop.Dao.LoaiSPDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dao.TaiKhoanDao;
import DiamonShop.Dao.CT_DDHDao;
import DiamonShop.Dao.DonDHDao;
import DiamonShop.Dao.GioHangDao;
import DiamonShop.Entity.CT_DDH;
import DiamonShop.Entity.DonDH;
import DiamonShop.Entity.LoaiSP;
import DiamonShop.Entity.SanPham;
import DiamonShop.Entity.Slides;
import DiamonShop.Entity.TaiKhoan;

@Service
public class HomeServiceImpl{
	@Autowired
    private SlidesDao slidesDao;
	@Autowired
	private LoaiSPDao loaiSPDao;
	@Autowired
	private SanPhamDao sanPhamDao;
	@Autowired
	private TaiKhoanDao taiKhoanDao;
	@Autowired
	private GioHangDao gioHangDao;
	@Autowired
	private DonDHDao donDHDao;
	@Autowired
	private CT_DDHDao cT_DDHDao;

    public List<Slides> GetDataSlide() {
        return slidesDao.GetDataSlide();
    }
	public List<LoaiSP> GetDataLoaiSP() {
		return loaiSPDao.GetDataLoaiSP(); 
	}
	public List<SanPham> GetDataSanPham() {
		return sanPhamDao.GetDataSanPham(); 
	}
	public List<SanPham> GetDataSanPhamByLoaiSP(int id) {
		return sanPhamDao.GetDataSanPhamByLoaiSP(id); 
	}
	public SanPham GetDataSingleSanPham(int id) {
		return sanPhamDao.GetDataSingleSanPham(id); 
	}
	public boolean AddToCart(int id, String user) {
		return gioHangDao.AddToCart(id, user); 
	}
	public void addAccount(TaiKhoan TK) {
		taiKhoanDao.addAccount(TK);
	}
	
	public boolean checkLogin(TaiKhoan TK) {
		return taiKhoanDao.checkLogin(TK);
	}
	public List<SanPham> GetCart(String userid) {

		return gioHangDao.GetCart(userid);
	}
	public void RemoveCart(int id, String userid) {
		gioHangDao.RemoveCart(id, userid);
	}
	public int payment(String useremail) {
		return gioHangDao.payment(useremail);
	}
	public void savepayment(int id, String useremail) {
		donDHDao.savepayment(id,useremail);
	}
	public TaiKhoan getUser(String useremail) {
		return taiKhoanDao.getUser(useremail);
	}
	public List<DonDH> getDonDH(String useremail) {
		return donDHDao.getAllDonDH(useremail);
		
	}
	public List<DonDH> getDonDH() {
		return donDHDao.getAllDonDH();
		
	}
	public List<CT_DDH> getCT_DDH(int id) {
		return cT_DDHDao.getAllCTDDH(id) ;
	}
	public boolean checkLoginAdmin(TaiKhoan tK) {
		
		return taiKhoanDao.checkLoginAdmin(tK);
	}
	public void updateProduct(SanPham sp) {
		sanPhamDao.updateProduct(sp);
	}
	
	public boolean checkAdmin (String Email) {
		return taiKhoanDao.checkAdmin(Email);
	}
	public void addproduct(SanPham sp) {
		 sanPhamDao.addproduct(sp);
	}
	public void addcategory(LoaiSP lsp) {
		loaiSPDao.addcategory(lsp);
		
	}
	public void updatecate(LoaiSP lsp) {
		loaiSPDao.updatecate(lsp);
		
	} 
}