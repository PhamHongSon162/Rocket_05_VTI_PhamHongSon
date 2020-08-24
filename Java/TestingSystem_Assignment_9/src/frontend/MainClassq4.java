package frontend;

import entity.NgayThangNam;
import entity.NgayThangNam.GioPhutGiay;

public class MainClassq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NgayThangNam date = new NgayThangNam();
        date.ngay = 15;
        date.thang = 10;
        date.nam = 1017;
        
        GioPhutGiay time =date.new GioPhutGiay();
        time.gio = 10;
        time.phut = 19;
        time.giay = 30;
        
        time.xuatThongTin();
	}

}
