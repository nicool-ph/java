// Nama    : Nicholas ramadhan m
// Kelas   : X RPL 1 
// No      : 28
// Rumah   : Pakis
// Sekolah : SMKN 9 MALANG

import java.util.Scanner;

public class PPnic1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("masukkan lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println("luas persegi panjang = " + luas);
    }
}
