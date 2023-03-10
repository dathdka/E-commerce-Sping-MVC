package DiamonShop.Dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.CT_DDH;
import DiamonShop.Entity.DonDH;
import DiamonShop.Entity.MapperDonDH;
import DiamonShop.Entity.MapperSanPham;
import DiamonShop.Entity.MapperTaiKhoan;
import DiamonShop.Entity.SanPham;
import DiamonShop.Entity.TaiKhoan;

@Repository
public class GioHangDao {

	@Autowired
	public JdbcTemplate _jdbcTemplate;
	@Autowired
	public TaiKhoanDao taiKhoanDao;
	@Autowired
	public DonDHDao donDHDao;
	@Autowired
	public CT_DDHDao cT_DDHDao;
	@Autowired
	public SanPhamDao sanPhamDao;
	

	public boolean AddToCart(int id, String user) {
		TaiKhoan tk = taiKhoanDao.getUser(user);
		int iduser = tk.getIduser();
		DonDH listhd = donDHDao.getHoaDon(iduser);
		if (listhd==null) {
			String sqlddh = "INSERT INTO dondh (MaDDH, IDUser, ThoiGianDat, TongTien, TrangThai) VALUES " + "(null, '" + iduser
					+ "', '"+LocalDateTime.now()+"', 0, 0 )";
			_jdbcTemplate.update(sqlddh);
			listhd = donDHDao.getHoaDon(iduser);
		}
		int ddh = listhd.getMaddh();
		SanPham listsp = sanPhamDao.GetDataSingleSanPham(id);
		String sql = "INSERT INTO ct_ddh (MaSP, MaDDH, SLuong, TongTien) VALUES (" + id + ", " + ddh + ", " + " 1, "
					+ listsp.getDongia() + ")";
			_jdbcTemplate.update(sql);
			return true;
	}

	public List<SanPham> GetCart(String userid) {
		TaiKhoan tk = taiKhoanDao.getUser(userid);
		int id = tk.getIduser();
		DonDH ddh = donDHDao.getHoaDon(id) ;
		List<SanPham> listsp = new ArrayList<SanPham>();
		if(ddh!=null) {
			int maddh = ddh.getMaddh();
			List<CT_DDH> ct_ddh = cT_DDHDao.getAllCTDDH(maddh);
			
			for( CT_DDH item : ct_ddh) {
				
				listsp.add(sanPhamDao.GetDataSingleSanPham(item.getMasp()));
			}
		}
		return listsp;
	}

	public void RemoveCart(int id, String userid) {

		TaiKhoan tk = taiKhoanDao.getUser(userid);
		int user = tk.getIduser();
		DonDH ddh = donDHDao.getHoaDon(user);
		int maddh = ddh.getMaddh();
		cT_DDHDao.removeCart(id, maddh);
	}

	public int payment(String useremail) {
		TaiKhoan tk = taiKhoanDao.getUser(useremail);
		int user = tk.getIduser();
		DonDH ddh = donDHDao.getHoaDon(user);
		int tongtien = 0;
		if(ddh!=null) {
			int maddh = ddh.getMaddh();
			List<CT_DDH> ct_ddh = cT_DDHDao.getAllCTDDH(maddh);
			if(!ct_ddh.isEmpty()) {
				for( CT_DDH item : ct_ddh ) {
					SanPham sp = sanPhamDao.GetDataSingleSanPham(item.getMasp());
					if(sp.getKhuyenmai() >0) {
						tongtien += (sp.getDongia() - (sp.getDongia()*sp.getKhuyenmai())/100* item.getSluong() );
					}
					else {
						tongtien += sp.getDongia();
					}
				}
			}
		}
		return tongtien;
	}
}
