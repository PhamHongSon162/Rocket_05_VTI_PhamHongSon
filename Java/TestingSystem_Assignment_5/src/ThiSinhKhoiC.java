import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh {
	private String monThi = "Văn,Sử,Địa";


	public ThiSinhKhoiC(String sBD, String hoTen, String diaChi,KhuVucUuTien mucUuTien) {
		super(sBD, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
		this.monThi= monThi;
	}
	public ThiSinhKhoiC() {
		// TODO Auto-generated constructor stub
	}
	public String getMonThi() {
		return monThi;
	}
		@Override
		public void getInfor() {
			super.getInfor();
			System.out.println("Môn Thi  : " + monThi);
	}
	}


