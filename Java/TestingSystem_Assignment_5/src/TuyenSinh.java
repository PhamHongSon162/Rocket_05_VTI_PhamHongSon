import java.util.ArrayList;
import java.util.Scanner;
public  class TuyenSinh implements ITuyenSinh {
private ArrayList<ThiSinh> dsThiSinh;
public TuyenSinh() {
	dsThiSinh = new ArrayList<ThiSinh>();
}
//a)Them ThiSinh
public void themThiSinh() {
	int n;
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhập số thi Sinh muốn nhập:  ");
	n = scanner.nextInt();

	int choose;
	ThiSinh thiSinh = new ThiSinh();
	for (int i = 0; i < n; i++) {
		System.out.println("Bạn muốn nhập thí sinh khối nào? (1:A || 2:B|| 3: C) ");
		choose = scanner.nextByte();

		switch (choose) {
		case 1:
			thiSinh = new ThiSinhKhoiA();
			break;
		case 2:
			thiSinh = new ThiSinhKhoiB();
			break;
		case 3:
			thiSinh = new ThiSinhKhoiC();
			break;
		default:
			System.out.println("Nhập sai !");
			i--;
			break;
		}

		thiSinh.input();
		dsThiSinh.add(thiSinh);

}
}
//b)hiện thí sinh
@Override
public void hienThiSinh() {
		for (ThiSinh thiSinh : dsThiSinh) {
			thiSinh.getInfor();
		}
	}
//c) Tim kiêm thi Sinh
public void timKiemTheoTen() {
Scanner scanner = new Scanner(System.in);

String hoTen;
System.out.println("Nhập họ tên cần tìm: ");
hoTen = scanner.nextLine();

for (ThiSinh thiSinh : dsThiSinh) {
	if (hoTen.equals(thiSinh.getHoTen())) {
		thiSinh.getInfor();
	}
}
}
}

