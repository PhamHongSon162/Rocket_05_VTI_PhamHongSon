import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
		        int soHinh = nhapSoHinhKhoiTao();
		        System.out.println("Số Hình đã nhập : " + soHinh);
		    } catch (HinhHocException e) {
		        System.out.println(e.getMessage());
		    }
		}

	private static int nhapSoHinhKhoiTao() throws HinhHocException {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Hãy nhập số hình Khởi tạo: ");
	    int count = 0 ;
	 
	        count = scanner.nextInt();
	        if (count > Configs.SO_LUONG_HINH_TOI_DA) 
	        	throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
	   
	    return count;
	    
	}
	}



	


