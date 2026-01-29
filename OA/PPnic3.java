// Nama    : Nicholas ramadhan m
// Kelas   : X RPL 1 
// No      : 28
// Rumah   : Pakis
// Sekolah : SMKN 9 MALANG

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PPnic3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan a: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Masukkan b: ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Masukkan c: ");
        int c = Integer.parseInt(br.readLine());

        int hasil = a + b * c;
        System.out.println("Hasil = " + hasil);
    }
}
