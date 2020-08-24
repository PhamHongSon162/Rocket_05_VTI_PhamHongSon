import java.util.Scanner;

public class HinhTron implements HinhHoc{
	float r;
	float PI = 3.14f ;

	    

	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		
		return 2 * PI * r;
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return   PI * r * r ;
	}
	 
	

}

