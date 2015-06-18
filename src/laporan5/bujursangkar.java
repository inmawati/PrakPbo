package laporan5;

public class bujursangkar extends bentuk{
	private float sisi;
	public bujursangkar(){
		sisi=5;
	}
	public float hitungluas(){
		return sisi*sisi;
	}
	
	public void tulis(){
		System.out.println("bujursangkar.tulis");
	}
}
