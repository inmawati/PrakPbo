package laporan4;

public class Hewan {
	public static int jumlah_hewan = 0;
	public String spesies;
	
	public static void tambahHewan(){
		jumlah_hewan++;
	}
	
	public static void main(String args[]){
		Hewan objekHewan= new Hewan();
		objekHewan.spesies= " kucing";
		Hewan.tambahHewan();
		System.out.println(Hewan.jumlah_hewan);
		
		Hewan objekHewanDua= new Hewan();
		objekHewanDua.spesies= " holis";
		Hewan.tambahHewan();
		System.out.println(Hewan.jumlah_hewan);
		
		System.out.println(jumlah_hewan);
		System.out.println(jumlah_hewan);
	}

}
