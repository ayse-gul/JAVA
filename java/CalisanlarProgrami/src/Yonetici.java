
public class Yonetici extends Calisan{
	
	private int sorumlu_kisi_sayisi;

	public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
		super(ad, soyad, id);
		// TODO Auto-generated constructor stub
		this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Sorumlu oldu�u ki�i say�s� : "+sorumlu_kisi_sayisi);
	}
	
	public void zamYap(int miktar) {
		System.out.println("�al��anlara "+miktar+" TL za yap�ld�");
	}

	
}
