import java.util.Scanner;

public class Julnedräknaren {

	public static void main(String[] args) {
		Scanner tangentbord = new Scanner(System.in);
		final double MEDEL_MÅNAD = 30.4375;
		final int ANTAL_DAGAR = 365;
		final int JUL = 359;
		
		System.out.println("Hej, vad heter du?");
		String namn = tangentbord.nextLine();
		System.out.println("Hej " + namn + " vilken månad är det i siffror?");
		int månad = tangentbord.nextInt();
		System.out.println("Vilken dag är det i siffror?");
		int dag = tangentbord.nextInt();
		double dagarTillJul = ((JUL) - (MEDEL_MÅNAD * månad) + (MEDEL_MÅNAD - dag));
		if (månad == 12 && dag > 24) {
			dagarTillJul = dagarTillJul + ANTAL_DAGAR;
		}
		System.out.println("Det är " + (int) dagarTillJul
				+ " dagar kvar till jul! :D ");
	}
}
