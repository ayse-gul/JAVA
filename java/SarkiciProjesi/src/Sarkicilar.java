import java.util.ArrayList;

public class Sarkicilar {
	
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();
	
	public void sarkiciBastir() {
		
		System.out.println("�ark�c� Listesinde "+sarkiciListesi.size()+" kadar �ark�c� var");
		for(int i=0;i<sarkiciListesi.size();i++) {
			
			System.out.println((i+1)+". s�radaki �ark�c� : "+sarkiciListesi.get(i));
		}
	}
	
	public void sarkiciEkle( String sarkici) {
		
		sarkiciListesi.add(sarkici);
		System.out.println("�ark�c� listeye eklendi");
	}
	public void sarkiciGuncelle(int pozisyon,String yeni) {
		
		sarkiciListesi.set(pozisyon , yeni);
		String eski = sarkiciListesi.get(pozisyon);
		System.out.println(eski+" �ark�c�s� "+yeni+" �ark�c�s�yla de�i�tirildi");
	}
	
	public void sarkiciSil(int pozisyon) {
		sarkiciListesi.remove(pozisyon);
		String eski = sarkiciListesi.get(pozisyon);
		System.out.println(eski+" �ark�c�s� silindi");
	}

	public void sarkiciAra(String sarkici) {
	
		int pozisyon = sarkiciListesi.indexOf(sarkici);
		if(pozisyon>=0) {
			System.out.println(sarkiciListesi.get(pozisyon)+" isimli �ark�c� bulundu");
		}
		else
			System.out.println("Bu isimde �ark�c� Listede yok");
	}
}
