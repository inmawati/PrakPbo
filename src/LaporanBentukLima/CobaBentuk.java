package LaporanBentukLima;

import laporan5.bentuk;
import laporan5.bujursangkar;
import laporan5.segitigasamakaki;
import laporan5.segitigasamasisi;

public class CobaBentuk {
	public static void cetakbangun(bentuk b){
		System.out.println(b.hitungluas());
		b.tulis();
		b.geser(5, 5);
	}
	
	public static void main(String args[]) {
		cetakbangun (new bujursangkar());
		cetakbangun (new segitigasamakaki());
		cetakbangun (new segitigasamasisi());
	}


}
