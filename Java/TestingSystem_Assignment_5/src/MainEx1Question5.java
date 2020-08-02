import java.util.Scanner;

public class MainEx1Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             question5();
	}

	private static void menuQuesion5() {
		System.out.println("MENU");
		System.out.println("  1. Thêm thí sinh       ");
		System.out.println("  2. Hiện hiện thí sinh  ");
		System.out.println("  3. Tìm thí sinh        ");
		System.out.println("  0. Thoát               ");
		System.out.println("Nhập chức năng :         ");
	}
	public static void question5() {
		TuyenSinh tuyensinh = new TuyenSinh() ;
		byte choose;
		do {
			Scanner scanner = new Scanner(System.in);
			menuQuesion5();
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				tuyensinh.themThiSinh();
				break;
			case 2:
				tuyensinh.hienThiSinh();
				break;
			case 3:
				tuyensinh.timKiemTheoTen();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
		} while (choose != 0);
	}
	}

