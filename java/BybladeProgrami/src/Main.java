import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		///Polymorphizm kullanarak beyblade program�
		
		System.out.println("*******Beblade Program�na Ho�geldiniz********");
		System.out.println("��k�� i�in q ya bas�n�z");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Hangi Beyblade'i �retmek istersiniz ?");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Program Sonlan�yor Ho�cakal�n...");
				break;
			}
			else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				if(beyblade==null) {
					System.out.println("L�tfen ge�erli bir beyblade ismi giriniz");
				}
				else {
					beyblade.bilgileriGoster();
					beyblade.saldiri();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
			}
		}

	}

}
