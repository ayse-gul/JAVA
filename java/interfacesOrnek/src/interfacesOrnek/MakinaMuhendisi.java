package interfacesOrnek;

public class MakinaMuhendisi implements Imuhendis{
	
	private boolean askerlik;
	private boolean adliSicil;

	public MakinaMuhendisi(boolean askerlik, boolean adliSicil) {
		super();
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumuSorgula() {
		if(askerlik) {
			System.out.println("Askerli�imi Yapt�m");
		}
		else {
			System.out.println("Askerli�imi yapmad�m");
		}
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		return "Ortalamam : "+derece;
	}

	@Override
	public void adliSicilSorgula() {
		if(adliSicil) {
			System.out.println("Adli sicil kayd�m bulunuyor");
		}
		else {
			System.out.println("Adli sicil kayd�m bulunmuyor");
		}
		
	}

	@Override
	public void isTecrubesi(String[] array) {
		
		if(array.length==0) {
			System.out.println("Herhangi bir i� tecr�bem bulunmuyor");
		}
		else {
			System.out.println("Makine M�hendisi olarak �u �irketlerde �al��t�m");
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}	
		}
	}

	public void referansGetir(String[] array) {
		
		if(array.length==0) {
			System.out.println("Herhangi bir referans bulunmuyor");
		}
		else {
			System.out.println("Referanslar�m : ");
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}	
		}
	}
	

}
