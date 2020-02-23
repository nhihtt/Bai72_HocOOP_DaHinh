package tonhi.com.test;

import tonhi.com.model.IDoAble;
import tonhi.com.model.NhanVien;
import tonhi.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		IDoAble x;
		x= new NhanVien();
		x.doSomething();
		x= new SinhVien();
		x.doSomething();
	}

}
