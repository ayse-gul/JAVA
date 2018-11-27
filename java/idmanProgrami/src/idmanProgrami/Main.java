package idmanProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�dman Program�na Ho�geldiniz");
		
		String idmanlar = "Ge�erli Hareketeler \n\nBurppe\nPushup(�INAV)\nSitup(MEK�K)\nSquat";
		System.out.println(idmanlar);
		System.out.println("Bir idman olu�turunuz");
		
		System.out.println("Burpee Say�s�");
		int burpee = scanner.nextInt();
		
		System.out.println("Pushup Say�s�");
		int pushup = scanner.nextInt();
		
		System.out.println("Situp Say�s�");
		int situp = scanner.nextInt();
		
		System.out.println("Squat Say�s�");
		int squat = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(burpee,pushup,situp,squat);
		
		System.out.println("�dman�n�z ba�l�yor...");
		
		while(idman.idmanBittiMi()==false) {
			System.out.println("Hareket T�r� = (Burpee,Pushup,Situp,Squat)");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten Ka� Tane Olsun");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}       
		System.out.println("Idman�n� ba�ar�yla bitirdin....");
	}

}
