package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPham implements RowMapper<SanPham> {
	public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
	    SanPham sanpham = new SanPham();
	    sanpham.setMasp(rs.getInt("MaSP"));
	    sanpham.setMalsp(rs.getInt("MaLSP"));
	    sanpham.setTensp(rs.getString ("TenSP"));
	    sanpham.setDongia(rs.getInt("DonGia"));
	    sanpham.setSoluong(rs.getInt("SoLuong"));
	    sanpham.setKhuyenmai(rs.getInt("KhuyenMai"));
	    sanpham.setMota(rs.getString("MoTa"));
	    sanpham.setHinhanh(rs.getString("HinhAnh"));
	    return sanpham;
	}
}