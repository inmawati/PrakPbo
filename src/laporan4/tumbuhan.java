package laporan4;

public class tumbuhan {
	private static String namaSpesies;
	private static int lebarDaun;
	
	private tumbuhan(){
		namaSpesies = "sayur";
		lebarDaun = 30;
		
	}
private tumbuhan (String nama, int lebar){
	namaSpesies = nama;
	lebarDaun = lebar;
}

public static void cetaktumbuhan(){
	System.out.println(namaSpesies +""+lebarDaun);	
}
public static void main(String args[]){
	tumbuhan Tumbuhan = new tumbuhan();
	cetaktumbuhan();
	Tumbuhan= new tumbuhan("buah",20);
	cetaktumbuhan();
}
}
