package laporan4;



public class orang {
	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float beratBadan;
	
	public void cetakorang () {
		System.out.println(nama + "," + alamat +","+ tinggiBadan + "," + beratBadan);
	}
	public static void main(String[] args){
		orang objekorang= new  orang();
		objekorang.nama= "awaludin";
		objekorang.alamat= "makassar";
		objekorang.tinggiBadan= 170;
		objekorang.beratBadan= 60.4f;
		objekorang.cetakorang();
		
		orang objekorangDua= new orang();
		objekorang.nama= "inma";
		objekorang.alamat= "kolaka";
		objekorang.tinggiBadan= 170;
		objekorang.beratBadan= 60.4f;
		objekorang.cetakorang();
		
	}

}
