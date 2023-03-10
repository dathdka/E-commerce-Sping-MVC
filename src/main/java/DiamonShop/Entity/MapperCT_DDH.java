package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCT_DDH implements RowMapper<CT_DDH> {
	public CT_DDH mapRow(ResultSet rs, int rowNum) throws SQLException {
		CT_DDH ct_ddh = new CT_DDH();
	    ct_ddh.setMasp(rs.getInt("MaSP"));
	    ct_ddh.setMaddh(rs.getInt("MaDDH"));
	    ct_ddh.setSluong(rs.getInt("SLuong"));
	    ct_ddh.setTongtien(rs.getInt("TongTien"));
	    return ct_ddh;
	}
}