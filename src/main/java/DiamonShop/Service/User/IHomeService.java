package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Entity.LoaiSP;
import DiamonShop.Entity.SanPham;
import DiamonShop. Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
    public List<Slides> GetDataSlide();
	@Autowired
	public List<LoaiSP> GetDataLoaiSP();
	@Autowired
	public List<SanPham> GetDataSanPham();
}
