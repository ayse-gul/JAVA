
public class Drayga extends Beyblade{
	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar=kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+" � ortaya ��kar�yor");
        System.out.println(getBeybladeci()+" in sald�r�s� Alev k�l�c�");

	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad� : "+kutsalCanavar);		
	}
	
	
}
