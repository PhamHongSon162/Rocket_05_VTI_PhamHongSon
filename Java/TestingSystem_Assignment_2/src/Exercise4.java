import java.time.LocalDate;
import java.util.Random;
public class Exercise4 {

	public static void main(String[] args) {
		        // Question 1 //
				Random random = new Random();
				int x = random.nextInt();
				System.out.println(x);

				// Question 2 //
				float y = random.nextFloat();
				System.out.println(y);

				// Question 3 //
				String[] names = { " Phạm Hồng Sơn ", "Lê Huy Lực ", "Lê Đăng Huy " };
				int i = random.nextInt(names.length);
				System.out.println(names[i]);

				// Question 4 //
				int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
				int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
				long randomInt = minDay + random.nextInt(maxDay - minDay);
				LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
				System.out.println(randomDay);

				// Question 5 //
				int now = (int) LocalDate.now().toEpochDay();
				randomInt = now - random.nextInt(365);
				randomDay = LocalDate.ofEpochDay(randomInt);
				System.out.println(randomDay);

				// Question 6 //
				int z = random.nextInt(999 - 100 + 1) + 100;
				System.out.println(z);
			
	}

}
