package interfacesOrnek;

public class pcMuhendisi implements Imuhendis{
	
	private boolean adliSicil;
	private boolean askerlik;
	

	public pcMuhendisi(boolean adliSicil, boolean askerlik) {
		super();
		this.adliSicil = adliSicil;
		this.askerlik = askerlik;
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
		
		System.out.println("Bilgisayar M�hendisi olarak �u �irketlerde �al��t�m");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
