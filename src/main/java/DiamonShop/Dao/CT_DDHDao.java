package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.CT_DDH;
import DiamonShop.Entity.MapperCT_DDH;

@Repository
public class CT_DDHDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<CT_DDH> getAllCTDDH(int ddh){
		List<CT_DDH> list = new ArrayList<CT_DDH>();
		String sql = "SELECT * FROM ct_ddh WHERE `MaDDH` = " + ddh;
		list = _jdbcTemplate.query(sql, new MapperCT_DDH());
		return list;
	}
	
	public void removeCart(int id, int maddh) {
		String sql = "DELETE FROM ct_ddh WHERE `MaSP` = "+id+" AND `MaDDH` =" +maddh;
		_jdbcTemplate.update(sql);
	}
	
	
}
