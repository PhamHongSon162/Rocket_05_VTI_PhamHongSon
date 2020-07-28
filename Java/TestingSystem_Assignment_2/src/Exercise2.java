import java.text.SimpleDateFormat;
import java.util.Date;
public class Exercise2 {
	public static void main(String[] args) {
		//question 1//
		int s = 5;
		System.out.printf("'%d' %n", s);
		//question 2 //
		int m = 100000000;
		System.out.printf("'%,d' %n" , m);
		//question 3 //
		float n = 5.567098f;
		System.out.printf("'%5.4f' %n", n);
		//question 4 //
		String k = "Nguyen Van A";
		System.out.printf("Tên tôi là \"" + k + "\" và tôi đang độc thân \n");
		// question 5 //
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);


	}

}
