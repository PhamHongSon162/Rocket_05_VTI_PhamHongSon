import java.util.Scanner;
public class CanBo {
private	String hoTen;
private	int tuoi;
private	Gender gioiTinh;
private	String diaChi;

public CanBo(String hoten, int tuoi, Gender gioitinh, String diachi) {
	super();
	this.hoTen = hoten;
	this.tuoi = tuoi;
	this.gioiTinh = gioitinh;
	this.diaChi = diachi;
}

public CanBo() {
	// TODO Auto-generated constructor stub
}

public String getHoten() {
	return hoTen;
}
public void setHoten(String hoten) {
	this.hoTen = hoten;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public Gender getGioiTinh() {
	return gioiTinh;
}
private void setGioiTinh(int gioiTinh) {
	if (gioiTinh == 0) {
		this.gioiTinh = Gender.valueOf("MALE");
	} else if (gioiTinh == 1) {
		this.gioiTinh = Gender.valueOf("FEMALE");
	} else  
		this.gioiTinh = Gender.valueOf("UNKNOWN");
}



public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public void input() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhập họ tên: ");
	hoTen = scanner.nextLine();	

	System.out.println("Nhập địa chỉ: ");
	diaChi = scanner.nextLine();

	System.out.println("Nhập tuổi: ");
	tuoi = scanner.nextInt() ;

	System.out.println("Nhập giới tính (0:MALE, 1:FEMALE, 2:UNKOWN)");
	setGioiTinh(scanner.nextInt());

}
public void getInfor() {
	System.out.println("Họ tên      : " + hoTen);
	System.out.println("Tuổi        : " + tuoi);
	System.out.println("Giới tính   : " + gioiTinh);
	System.out.println("Địa chỉ     : " + diaChi);
}
@Override
public String toString() {
	return "CanBo{" + "hoten='" + hoTen + '\'' + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diachi='" + diaChi
			+ '\'' + '}';
}
}