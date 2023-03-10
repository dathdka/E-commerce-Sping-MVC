package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperSanPham;
import DiamonShop.Entity.SanPham;

@Repository
public class SanPhamDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<SanPham> GetDataSanPham() {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT * FROM `sanpham`";
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}
	
	public List<SanPham> GetDataSanPhamByLoaiSP(int id) {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT * FROM sanpham WHERE MaLSP = "+ id;
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}
	
	public SanPham GetDataSingleSanPham(int id) {
		SanPham list = new SanPham();
		String sql = "SELECT * FROM sanpham WHERE MaSP = "+ id + " LIMIT 1";
		list = _jdbcTemplate.queryForObject(sql, new MapperSanPham());
		return list;
	}

	public void updateProduct(SanPham sp) {
		String sql = "UPDATE sanpham SET `MALSP` = "+ sp.getMalsp()+ ", `TenSP` = '"+ sp.getTensp() +"', `DonGia` = "
				+ sp.getDongia() +", `SoLuong` = "+ sp.getSoluong()+", `KhuyenMai` ="+ sp.getKhuyenmai()+ ", `MoTa`= '"
						+sp.getMota() +"', `HinhAnh` = '"+sp.getHinhanh()+"' WHERE `MaSP`= "+sp.getMasp();
		_jdbcTemplate.update(sql);
	}

	public void addproduct(SanPham sp) {
		String sql = "INSERT INTO sanpham (MaSP, MaLSP, TenSP, DonGia, SoLuong, KhuyenMai, MoTa, HinhAnh) VALUES (null, "+ sp.getMalsp()+ ", '"+ sp.getTensp() +"', "
				+ sp.getDongia() +", "+ sp.getSoluong()+", "+ sp.getKhuyenmai()+ ", '"
						+sp.getMota() +"', '"+sp.getHinhanh()+"')";
		_jdbcTemplate.update(sql);
		
	}
}