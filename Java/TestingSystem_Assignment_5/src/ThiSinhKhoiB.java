import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh {
	private String monThi = "Toán,Hóa,Sinh";


public ThiSinhKhoiB(String sBD, String hoTen, String diaChi,KhuVucUuTien mucUuTien) {
	super(sBD, hoTen, diaChi, mucUuTien);
	// TODO Auto-generated constructor stub
	this.monThi= monThi;
}
public ThiSinhKhoiB() {
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
