
public class Draciel extends Beyblade {
	private String kutsalCanavar;

	public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsalCanavar+" � ortaya ��kar�yor");
        System.out.println(getBeybladeci()+" in sald�r�s� Alev k�l�c�");

	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad� : "+kutsalCanavar);		
	}
	
	

}
