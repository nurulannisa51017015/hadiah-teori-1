/**
 * @(#)biodata.java
 *
 *
 * @author 
 * @version 1.00 2019/9/18
 */


import java.util.Scanner;
public class biodata {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nama1, alamat;
		int tahun;
		System.out.print("Masukan Nama: ");
		nama1 = input.nextLine();
		System.out.print("Masukan Alamat: ");
		alamat = input.nextLine();
		System.out.print("Masukan Umur: ");
		tahun = input.nextInt();
		System.out.println();
		
		System.out.println("Saudara: " + nama1);
		System.out.println("Tinggal di: " + alamat);
		System.out.println("Berumur: " + tahun + " tahun");
	}
}