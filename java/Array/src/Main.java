
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Sabiha G�k�en Havaliman�na Ho�geldiniz...");
		
		String sartlar = "Yurtd���na ��k�� Kurallar�\n"
						+"....Siyasi Yasa��n�z Bulunmamal�\n"
						+"....15 TL har� bedelini Tam yat�rmal�s�n�z\n"
						+"....Gidece�iniz �lkeye vizeniz bulunmal�\n";
		String mesaj = "Yurtd��� �artlar�nda hepsini sa�lamal�s�n�z";
		
		while(true) {
			System.out.println("************************************");
			System.out.println(sartlar);
			System.out.println("**************�ARTLAR***************");
		
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Har� bedeli kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.yurtD�s�Harc�Kontrol()==false){
				System.out.println(mesaj);
				continue;
			}
			
			System.out.println("\nSiyasi yasak kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.siyasiYasakKontrol()==false) {
				System.out.println(mesaj);
				continue;
			}
			
			System.out.println("\nVize durumu kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.vizeDurumuKontrol()==false) {
				System.out.println(mesaj);
				continue;
			}
			System.out.println("��lemler tamam yurt d���na ��kabilirsiniz");
			break;
		}

	}

}
