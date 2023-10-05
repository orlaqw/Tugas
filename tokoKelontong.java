package Perulangan;

import java.util.Scanner;

public class tokoKelontong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        boolean status = true;
        int harga = 0;
        int total = 0;

        //do while untuk status true/ false harus memakai boolean, jika jawaban selain false akan terus mengulang dan menjalankan terus

        do { 
        System.out.println("List Harga\n1. Buku: 2500\n2. Pensil: 1000\n3. Penghapus: 500");
        System.out.println("Mau beli apa?");

        int barang = input.nextInt();
        input.nextLine();

        switch (barang){
            case 1:
                harga = 2500;
                total += harga;
                break;

            case 2:
                harga = 1000;
                total += harga;
                break;

            case 3:
                harga = 500;
                total += harga;
                break;

            default:
                harga = 0;
                break;

             }
       
        System.out.println("Apakah beli lagi/ tidak?");
        String lagi = input.nextLine();
        if (lagi.equalsIgnoreCase("Tidak")){
            status = false;
        }
        System.out.println("Total: "+total);
        }while (status);

    }
    
}
