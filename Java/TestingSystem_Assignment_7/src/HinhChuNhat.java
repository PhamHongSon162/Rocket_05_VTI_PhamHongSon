

public class HinhChuNhat implements HinhHoc {
	float chieuDai;
	float chieuRong;

	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		return (chieuDai + chieuRong) * 2 ;
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong ;
	}
}


