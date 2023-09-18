package Perulangan;

import java.util.Scanner;

public class PembelianLebih1Item {
        
                //Tugas

    //Masukkan jumlah item yang dibeli : 2
    //1. nama barang : buku tulis
    //1. harga : 2500
    //1. jumlah : 6
    //==========================
    //2. nama barang : penghapus
    //2. harga : 500
    //2. jumlah : 2
    //==========================
    //Total Pembelian : 16000

    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = input.nextInt();
            input.nextLine();

        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int totalPembelian = 0;
        while (jumlahItem >= i) {
            
        System.out.println(i + ". "+ "Nama Barang: ");
        String namaBarang = input.next();

        System.out.println(i + ". " +"Harga : ");
        harga = input.nextInt();

        System.out.println(i + ". " +"jumlah : ");
        jumlahBarang = input.nextInt();
        System.out.println("=========================");

        totalPembelian += harga * jumlahBarang;
        i++;
    }
    System.out.println("Jumlah item yang dibeli : "+jumlahItem);
    System.out.println("Total pembelian : "+totalPembelian);
}
}
