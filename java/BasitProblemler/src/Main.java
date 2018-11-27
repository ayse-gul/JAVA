import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Matematik ve Fizik problemleri hesaplama program�na ho�geldiniz...");
		
		String islemler = "********��lemler*********\n"
						  + "1.Daire Alan� Hesapla\n"
						  + "2.��gen �evresi Hesapla\n"
						  + "3.Vect�rlerin i� �arp�mlar�n� Hesapla\n"
						  + "��k��...";
		
		while(true) {
			System.out.println(islemler);
			System.out.println("��lemi Se�iniz : ");
			String islem= scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Dairenin Yar��ap�: ");
				int yaricap= scanner.nextInt();
				scanner.nextLine();
				Problem.Matematik.daireHesapla(yaricap);
			}
			else if(islem.equals("2")) {
				System.out.println("Kenar1: ");
				int k1= scanner.nextInt();
				System.out.println("Kenar2: ");
				int k2= scanner.nextInt();
				System.out.println("Kenar3: ");
				int k3= scanner.nextInt();
				scanner.nextLine();
				Problem.Matematik.ucgenCevresiHesapla(k1, k2, k3);
			}
			else if(islem.equals("3")) {
				
				Vector vec1 = new Vector("Vector1");
				Vector vec2 = new Vector("Vector2");
				Problem.Fizik.vektorIcCarpimi(vec1, vec2);
			}
			else {
				System.out.println("Ge�ersiz ��lem");
			}
			
			
		}

	}

}
