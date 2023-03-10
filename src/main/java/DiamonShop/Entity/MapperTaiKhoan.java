package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTaiKhoan implements RowMapper<TaiKhoan> {
	public TaiKhoan mapRow(ResultSet rs, int rowNum) throws SQLException {
	    TaiKhoan taikhoan = new TaiKhoan();
	    taikhoan.setIduser(rs.getInt("IDUser"));
	    taikhoan.setEmail(rs.getString("Email"));
	    taikhoan.setMatkhau(rs.getString ("MatKhau"));
	    taikhoan.setTenkh(rs.getString("TenKH"));
	    taikhoan.setDiachi(rs.getString("DiaChi"));
	    taikhoan.setSdt(rs.getString("SDT"));
	    taikhoan.setDiem(rs.getInt("Diem"));
	    taikhoan.setPhanquyen(rs.getBoolean("PhanQuyen"));
	    return taikhoan;
	}
}