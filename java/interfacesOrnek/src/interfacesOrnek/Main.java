package interfacesOrnek;

public class Main {

	public static void main(String[] args) {
		
	//	Interfaces muhendis1 = new Interface(); BU yanl��
		//PC MUHEND�S�//
		/*
		pcMuhendisi muhendis1 = new pcMuhendisi(false, false);
		muhendis1.askerlikDurumuSorgula();
		muhendis1.adliSicilSorgula();
		System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
		String[] tecrube = {"vestel","havelsan","aselsan"};
		muhendis1.isTecrubesi(tecrube);*/
		
		//Makine M�hendisi
		MakinaMuhendisi muhendis2 = new  MakinaMuhendisi(false, false);
		muhendis2.adliSicilSorgula();
		muhendis2.askerlikDurumuSorgula();
		System.out.println(muhendis2.mezuniyetOrtalamasi(3.20));
		String[] tecrube = {};
		String[] referans = {"utku","Ali","yonca"};
		muhendis2.isTecrubesi(tecrube);
		muhendis2.referansGetir(referans);
		
	}

}
