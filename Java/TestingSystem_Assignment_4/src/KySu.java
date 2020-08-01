import java.util.Scanner;
public class KySu extends CanBo{
	private String nganhDaoTao;
	
	public KySu(String hoten, int tuoi, Gender gioitinh, String diachi) {
		super(hoten, tuoi, gioitinh, diachi);
		this.nganhDaoTao = nganhDaoTao;

	}
	public KySu() {
		// TODO Auto-generated constructor stub
	}
	 
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	
	@Override
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập ngành đào tạo: ");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Ngành đào tạo  : " + nganhDaoTao);
	}

}
