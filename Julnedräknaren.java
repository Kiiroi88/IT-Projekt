import java.util.Scanner;

public class Julnedr�knaren {

	public static void main(String[] args) {
		Scanner tangentbord = new Scanner(System.in);
		final double MEDEL_M�NAD = 30.4375;
		final int ANTAL_DAGAR = 365;
		final int JUL = 359;
		
		System.out.println("Hej, vad heter du?");
		String namn = tangentbord.nextLine();
		System.out.println("Hej " + namn + " vilken m�nad �r det i siffror?");
		int m�nad = tangentbord.nextInt();
		System.out.println("Vilken dag �r det i siffror?");
		int dag = tangentbord.nextInt();
		double dagarTillJul = ((JUL) - (MEDEL_M�NAD * m�nad) + (MEDEL_M�NAD - dag));
		if (m�nad == 12 && dag > 24) {
			dagarTillJul = dagarTillJul + ANTAL_DAGAR;
		}
		System.out.println("Det �r " + (int) dagarTillJul
				+ " dagar kvar till jul! :D ");
	}
}
