import java.util.Scanner;
public class NhanVien extends CanBo {
	private String congViec;
	public NhanVien(String hoten, int tuoi, Gender gioitinh, String diachi) {
		super(hoten, tuoi, gioitinh, diachi);
		this.congViec=congViec;
		// TODO Auto-generated constructor stub
	}

public NhanVien() {
	// TODO Auto-generated constructor stub
}



public String getCongViec() {
	return congViec;
}

@Override
public void input() {
	super.input();

	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhập công việc: ");
	congViec = scanner.nextLine();
}
@Override
public void getInfor() {
	super.getInfor();
	System.out.println("Công việc  : " + getCongViec());
}

}

