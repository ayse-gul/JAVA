import java.util.Scanner;

public class Yolcu implements Yurtd�s�Kurallar�{

	private int harc;
	private boolean siyasi_yasak;
	private boolean vize_durumu;
	
	public Yolcu() {
		
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yat�rd���n�z Har� Bedeli: ");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Herhangi bir siyasi yasa��n�z bulunuyor mu(evet/hay�r): ");
		String cevap = scanner.nextLine();
		if(cevap.equals("evet")) {
			this.siyasi_yasak=true;
		}
		else {
			this.siyasi_yasak=false;
		}
		
		System.out.println("Vizeniz Bulunuyor mu(evet/hay�r): ");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.equals("evet")) {
			this.vize_durumu=true;
		}
		else {
			this.vize_durumu=false;
		}
	}
	
	@Override
	public boolean yurtD�s�Harc�Kontrol() {
		if(this.harc<15) {
			System.out.println("Harc� Eksik yat�rd�n�z L�tfen Tam yat�r�n�z");
			return false;
		}
		else {
			System.out.println("Yurt D��� Har� i�lemi Tamam");
			return true;
		}
	}
	
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasi_yasak==true) {
			System.out.println("Siyasi yasa��n�z bulunyor Yurt d���na ��kamazs�n�z");
			return false;
		}
		else {
			System.out.println("Yurt d���na ��kabilirsiniz");
			return true;
		}
	}
	
	
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vize_durumu==true) {
			System.out.println("Vizeniz var yurt d���na ��kabilirsiniz");
			return true;
		}
		else {
			System.out.println("Vizenizi yenilemeden ��kamazs�n�z");
			return false;
		}
	}
	
}
