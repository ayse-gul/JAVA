import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankam�za Ho� Geldiniz.....");
		System.out.println("*****************************");
		System.out.println("Kullan�c� Giri�i...");
		System.out.println("*****************************");
				
		int girisHakki = 3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Giri� Ba�ar�l�");	
				break;
			}
			else {
				System.out.println("Giri� Ba�ar�s�z");
				girisHakki--;
				System.out.println("Kalan Giri� Hakk�n�z :"+girisHakki);
			}
			if(girisHakki==0) {
				System.out.println("Giri� Hakk�n�z Doldu G�le G�le.....");
				return;
			}
		}
		System.out.println("***************************");
		String islemler = "1-Bakiye G�r�nt�le\n2-Para Yat�rma\n3-Para �ekme\n��k�� i�in Q'ya bas�n�z";
		System.out.println(islemler);
		System.out.println("***************************");
		while(true) {
			System.out.println("��lem Se�iniz.....");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("Yat�rmak istedi�iniz Tutar : ");
				int tutar  =scanner.nextInt();
				hesap.paraYatir(tutar);
			}
			else if(islem.equals("3")) {
				System.out.println("�ekmek istedi�iniz Tutar : ");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
			}
			else
				System.out.println("Ge�ersiz ��lem");
		}
		
		
		
		
		
		
		
	}

	
	
	
}
