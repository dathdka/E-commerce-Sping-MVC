package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDonDH implements RowMapper<DonDH> {
	public DonDH mapRow(ResultSet rs, int rowNum) throws SQLException {
	    DonDH donDH = new DonDH();
	    donDH.setMaddh(rs.getInt("MaDDH"));
	    donDH.setIduser(rs.getInt("IDUser"));
	    donDH.setThoigiandat(rs.getString("ThoiGianDat"));
	    donDH.setTongtien(rs.getInt("TongTien"));
	    donDH.setTrangthai(rs.getBoolean("TrangThai"));
	    return donDH;
	}
}
