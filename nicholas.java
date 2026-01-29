import java.util.Scanner;

public class nicholas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nama: ");
        String nama = scanner.nextLine();
        System.out.print("masukan angka: ");
        int angka = scanner.nextInt();
        System.out.println("masukan angka desimal: ");
        double desimal = scanner.nextDouble();
        
        System.out.println("nama: " + nama);
        System.out.println("angka: " + angka);  
        System.out.println("angka desimal: " + desimal);
    }
}