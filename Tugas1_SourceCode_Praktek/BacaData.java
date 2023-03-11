/*Nama  : Jamila Ulfiah*/
/*Nim   : 13020210033*/
/*Waktu : Jumat/10-03-2023/15.39*/

import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
 public class BacaData {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: ");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : 
		masukan.nextInt(); Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
