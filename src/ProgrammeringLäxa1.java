import java.util.Scanner;

public class ProgrammeringLäxa1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Vad heter du?");
		String name = input.nextLine();

		System.out.println("Age?");
		String age = input.nextLine();

		System.out.println("Adress?");
		String adress = input.nextLine();

		System.out.println("Postnummer?");
		String Postnummer = input.nextLine();

		System.out.println("Ort?");
		String Ort = input.nextLine();

		System.out.println("Telefonnummer?");
		String Telefonnummer = input.nextLine();

		System.out.println("Namn:" + " " + name);
		System.out.println("Ålder:" + " " + age);
		System.out.println("Adress" + " " + adress);
		System.out.println("\t" + Postnummer + " " + Ort);
		System.out.println("Telefonnummer:" + " " + Telefonnummer);
	}
}
