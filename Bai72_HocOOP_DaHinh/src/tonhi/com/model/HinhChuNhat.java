package tonhi.com.model;

public class HinhChuNhat extends HinhHoc {

	
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super(chieuDai, chieuRong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhChuVi() {
		return (this.getChieuDai()+this.getChieuRong())*2;
	}

	@Override
	public double tinhDienTich() {
		return this.getChieuDai()*this.getChieuRong();
	}

}
