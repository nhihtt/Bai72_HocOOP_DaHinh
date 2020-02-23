package tonhi.com.test;

import tonhi.com.model.HinhChuNhat;
import tonhi.com.model.HinhHoc;
import tonhi.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h = new HinhChuNhat(4,5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		System.out.println("----------------------------");
		h= new HinhVuong(5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Diện tích= "+h.tinhDienTich());
		System.out.println("----------------------------");
		HinhChuNhat hv1= new HinhVuong(5);
		System.out.println("Chu vi= "+hv1.tinhChuVi());
		System.out.println("Diện tích= "+hv1.tinhDienTich());
		
		
		
	}

}
