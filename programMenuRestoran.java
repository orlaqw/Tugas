import java.util.Scanner;

public class programMenuRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menuMakanan = {"Nasi Goreng", "Mie Goreng", "Ayam Goreng"};
        String[] menuMinuman = {"Air mineral", "Teh manis", "Jeruk"};
        int[] hargaMakanan = {15000, 12000, 10000};
        int[] hargaMinuman = {5000, 7000, 8000};
        int totalHarga = 0;
        boolean tambahMenu = true;
        
        while (tambahMenu) {
            System.out.println("Menu Makanan:");
            for (int i = 0; i < menuMakanan.length; i++) {
                System.out.println((i+1) + ". " + menuMakanan[i] + " - Rp" + hargaMakanan[i]);
            }
            System.out.println("\nMenu Minuman:");
                for (int i = 0; i < menuMinuman.length; i++) {
                System.out.println((i+1) + ". " + menuMinuman[i] + " - Rp" + hargaMinuman[i]);
            }
            System.out.print("\nPilih menu makanan (1-" + menuMakanan.length + "): ");
            int pilihan = input.nextInt();
            System.out.print("Pilih menu minuman (1-" + menuMinuman.length + "): ");
            int pilihan2 = input.nextInt();
            totalHarga += hargaMakanan[pilihan-1];
            totalHarga += hargaMinuman[pilihan-1];
            System.out.print("Tambah menu? (ya/tidak): ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                tambahMenu = false;
            }
        }
        
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.print("Bayar: Rp");
        int bayar = input.nextInt();
        if (bayar == totalHarga) {
            System.out.println("Uang anda pas.");
        } else if (bayar < totalHarga) {
            System.out.println("Maaf, uang anda kurang.");
        } else {
            int kembalian = bayar - totalHarga;
            System.out.println("Kembalian: Rp" + kembalian);
        }
    }
}