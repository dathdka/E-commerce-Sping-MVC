package DiamonShop.Entity;

public class CT_DDH  {
	private int masp      ;
	private int maddh     ;
	private int sluong    ;
	private int tongtien  ;
	private SanPham sp ;
	
	public CT_DDH() {
	    super();
	}

	public SanPham getSp() {
		return sp;
	}
	
	public void setSp(SanPham sp) {
		this.sp = sp;
	}
	
	public int getMasp() {
		return masp;
	}

	public void setMasp(int masp) {
		this.masp = masp;
	}

	public int getMaddh() {
		return maddh;
	}

	public void setMaddh(int maddh) {
		this.maddh = maddh;
	}

	public int getSluong() {
		return sluong;
	}

	public void setSluong(int sluong) {
		this.sluong = sluong;
	}

	public int getTongtien() {
		return tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	
	
}
