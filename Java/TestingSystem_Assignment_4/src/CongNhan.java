import java.util.Scanner;
public class CongNhan extends CanBo{
private int bac;

public CongNhan(String hoten, int tuoi,Gender gioitinh, String diachi) {
	super(hoten, tuoi, gioitinh, diachi);
	// TODO Auto-generated constructor stub
	this.bac= bac;
	
	
}



public CongNhan() {
	// TODO Auto-generated constructor stub
}


public int getBac() {
	return bac;
}

@Override
public void input() {
	super.input();

	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhập bậc của công nhân: ");
	bac = scanner.nextByte();
}
	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Bậc  : " + bac);
}
}