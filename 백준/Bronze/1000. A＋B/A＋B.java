import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] numbers = str.split(" ");
		int sum = 0;
		for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            sum += num;
        }
		System.out.println(sum);
		
	}
}
