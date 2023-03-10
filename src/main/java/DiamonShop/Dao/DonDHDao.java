package DiamonShop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.DonDH;
import DiamonShop.Entity.MapperDonDH;
import DiamonShop.Entity.TaiKhoan;

@Repository
public class DonDHDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	@Autowired
	public TaiKhoanDao taiKhoanDao;
	@Autowired
	public DonDHDao donDHDao;
	
	public DonDH getHoaDon(int userid) {
		String sql = "SELECT * FROM dondh WHERE `IDUser` = "+userid+" AND TrangThai = 0 LIMIT 1";
		try {
			return _jdbcTemplate.queryForObject(sql, new MapperDonDH());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	

	public void savepayment(int id,String useremail) {
		TaiKhoan tk = taiKhoanDao.getUser(useremail);
		int user = tk.getIduser();
		DonDH ddh = donDHDao.getHoaDon(user);
		String sql = "UPDATE dondh SET TrangThai = 1 , `TongTien` = "+id+" WHERE `MaDDH` = " + ddh.getMaddh();
		_jdbcTemplate.update(sql);
	}

	public List<DonDH> getAllDonDH(String useremail) {
		TaiKhoan tk = taiKhoanDao.getUser(useremail);
		int user = tk.getIduser();
		String sql = "SELECT * FROM dondh WHERE `IDUser` =" + user + " AND TrangThai = 1";
		List<DonDH> list = _jdbcTemplate.query(sql, new MapperDonDH());
		return list;
	}
	public List<DonDH> getAllDonDH() {

		String sql = "SELECT * FROM dondh WHERE TrangThai = 1";
		List<DonDH> list = _jdbcTemplate.query(sql, new MapperDonDH());
		return list;
	}
}
