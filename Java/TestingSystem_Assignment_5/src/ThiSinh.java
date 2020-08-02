import java.util.Scanner;
public class ThiSinh {
	private String sBD;
	private String hoTen;
	private String diaChi;
	private KhuVucUuTien mucUuTien;

public ThiSinh(String sBD, String hoTen,String diaChi,KhuVucUuTien mucUuTien) {
	this.sBD = sBD;
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.mucUuTien = mucUuTien;
}
public ThiSinh() {
	// TODO Auto-generated constructor stub
}
	public String getsBD() {
		return sBD;
	}

	public void setsBD(String sBD) {
		this.sBD = sBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public KhuVucUuTien getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		     if (mucUuTien == 0) {
			this.mucUuTien = KhuVucUuTien.valueOf("KV1");
		} else if (mucUuTien == 1) {
			this.mucUuTien = KhuVucUuTien.valueOf("KV2NT");
		} else if (mucUuTien == 2) 
			this.mucUuTien = KhuVucUuTien.valueOf("KV2");
		else
			this.mucUuTien = KhuVucUuTien.valueOf("KV3");
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ tên: ");
		hoTen = scanner.nextLine();	

		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();

		System.out.println("Nhập Số Báo Danh: ");
		sBD = scanner.nextLine() ;

		System.out.println("Nhập Khu Vực Ưu Tiên : (0:KV1, 1:KV2NT, 2:KV2, 3: KV3)");
		setMucUuTien(scanner.nextInt());

	}
	public void getInfor() {
		System.out.println("Họ tên      : " + hoTen);
		System.out.println("Số Báo Danh        : " + sBD);
		System.out.println("Khu Vực Ưu Tiên   : " + mucUuTien);
		System.out.println("Địa chỉ     : " + diaChi);
	}
	@Override
	public String toString() {
		return "ThiSinh{" + "HọTên='" + hoTen + '\'' + ", Số Báo Danh=" + sBD + ", =" + mucUuTien + ", ĐịaChi='" + diaChi
				+ '\'' + '}';
	}
	}


	