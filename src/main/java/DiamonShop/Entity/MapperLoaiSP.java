package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperLoaiSP implements RowMapper<LoaiSP> {
	public LoaiSP mapRow(ResultSet rs, int rowNum) throws SQLException {
	    LoaiSP loaiSP = new LoaiSP();
	    loaiSP.setMalsp(rs.getInt("MaLSP"));
	    loaiSP.setTenlsp(rs.getString("TenLSP"));
	    return loaiSP;
	}
}