package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.LoaiSP;
import DiamonShop.Entity.MapperLoaiSP;

@Repository
public class LoaiSPDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<LoaiSP> GetDataLoaiSP() {
		List<LoaiSP> list = new ArrayList<LoaiSP>();
		String sql = "SELECT * FROM `loaisp`";
		list = _jdbcTemplate.query(sql, new MapperLoaiSP());
		return list;
	}

	public void addcategory(LoaiSP lsp) {
		String sql = "INSERT INTO loaisp (MaLSP, TenLSP) VALUES (null, '"+lsp.getTenlsp()+"')";
		_jdbcTemplate.update(sql);
	}

	public void updatecate(LoaiSP lsp) {
		String sql = "UPDATE loaisp SET `TenLSP` = '"+lsp.getTenlsp()+"' WHERE `MaLSP` = "+lsp.getMalsp()+"" ; 
		_jdbcTemplate.update(sql);
	}
}
