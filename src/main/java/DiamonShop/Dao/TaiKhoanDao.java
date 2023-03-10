package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperTaiKhoan;
import DiamonShop.Entity.TaiKhoan;
@Repository
public class TaiKhoanDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public void addAccount(TaiKhoan TK) {
		String sql = "INSERT INTO taikhoan (IDUser, Email, MatKhau, TenKH, DiaChi, SDT, Diem, PhanQuyen)"
				+ "VALUES (null, '" + TK.getEmail() + "', '" + TK.getMatkhau() + "','" + TK.getTenkh() + "'," + "'"
				+ TK.getDiachi() + "','" + TK.getSdt() + "' ,0,0)";
		_jdbcTemplate.update(sql);
	}

	public boolean checkLogin(TaiKhoan TK) {
		String sql = "SELECT * FROM taikhoan WHERE `Email` = '" +TK.getEmail()+
				"' AND `MatKhau` = '" +TK.getMatkhau()+"' LIMIT 1";
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(list.size()>0)
			
			return true;
			
		else
			return false;
	}
	
	public TaiKhoan getUser(String Email) {
		String sql = "SELECT * FROM taikhoan WHERE `Email` = '" +Email+"' LIMIT 1";
		TaiKhoan tk = new TaiKhoan();
		tk = _jdbcTemplate.queryForObject(sql, new MapperTaiKhoan());
		return tk;
	}

	public boolean checkLoginAdmin(TaiKhoan tK) {
		String sql = "SELECT * FROM taikhoan WHERE `Email` = '" +tK.getEmail()+
				"' AND `MatKhau` = '" +tK.getMatkhau()+"' AND `PhanQuyen` = 1 LIMIT 1";
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(list.size()>0)
			
			return true;
			
		else
			return false;
	}

	public boolean checkAdmin(String email) {
		String sql = "SELECT * FROM taikhoan WHERE `Email` = '"+email+"' AND `PhanQuyen` = 1 ";
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		try {
			list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		} catch (Exception e) {
			return false;
		}
		if(list.size()>0)
			return true;
		return false;
	}
}
