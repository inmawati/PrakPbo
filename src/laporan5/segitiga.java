package laporan5;

public abstract class segitiga extends bentuk {
	
	protected float alas;
	protected float tinggi;
	
	public segitiga(){
		alas=5;
		tinggi=5;
	}
	public float hitungluas(){
		return (alas*tinggi)/2;
		
	}

}
