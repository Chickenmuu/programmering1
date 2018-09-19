import java.util.Scanner;

public class LäxaV37{ 

public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int tall = input.nextInt();
		int min = tall;
		int max = tall;

		int tal2 = input.nextInt();
		if (tal2 > max) {
			max = tal2;
		}
		if (tal2 < min) {
			min = tal2;
		}
		int tal3 = input.nextInt();
		if (tal3 > max) {
			max = tal3;
		}	
		if (tal3 < min) {
			min = tal3;
		}
		int tal4 = input.nextInt();
		if (tal4 > max) {
			max = tal4;
		}
		if (tal4 < min) {
			min = tal4;
		}
		int tal5 = input.nextInt();
		if (tal5 > max) {
			max = tal5;
		}
		if (tal5 < min) {
			min = tal5;
		}
		int tal6 = input.nextInt();
		if (tal6 > max) {
			max = tal6;
		}
		if (tal6 < min) {
			max = tal6;
		}
		int tal7 = input.nextInt();
		if (tal7 > max) {
			max = tal7;
		}
		if (tal7 < min) {
			max = tal7;
		}
		int tal8 = input.nextInt();
		if (tal8 > max) {
			max = tal8;
		}
		if (tal8 < min) {
			min = tal8;
		}
		int tal9 = input.nextInt();
		if (tal9 > max) {
			max = tal9;
		}
		if (tal9 < min) {
			min = tal9;
		}
		int tal10 = input.nextInt();
		if (tal10 > max) {
			max = tal10;
		}
		if (tal10 < min) {
			min = tal10;
		}
		
		double summa = tall + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;
		
		System.out.println("maxtal: " + max);
		System.out.println("mintal: " + min);
		System.out.println("Medeltal: " + summa / 10);
	}
}
