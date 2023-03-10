package DiamonShop.Entity;

public class TaiKhoan {
	private int iduser;
	private String email;
	private String matkhau;
	private String tenkh;
	private String diachi;
	private String sdt;
	private int diem;
	private boolean phanquyen;
	
	public TaiKhoan() {
		super();
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public boolean isPhanquyen() {
		return phanquyen;
	}

	public void setPhanquyen(boolean phanquyen) {
		this.phanquyen = phanquyen;
	}
	
	
	
}
