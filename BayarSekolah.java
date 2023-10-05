package percabangan;

import java.util.Scanner;

public class BayarSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jalurMasuk;
        char golonganPendapatan;
        int pendapatan, bulan, DSP, SPP, totalBayar;

        System.out.println("Program Penghitung Biaya Sekolah");
        System.out.println("Pilihan jalur masuk");
        System.out.println("I. SMBTN\nII. SNMPTN\nIII. Mandiri");

        System.out.println("Masukkan pilihan anda (I/ II/ III)");
            jalurMasuk = input.nextLine();

        System.out.println("Masukkan besar pendapatan: Rp ");
            pendapatan = input.nextInt();

        System.out.println("Masukkan jumlah bulan yang ingin dibayar: ");
            bulan = input.nextInt();

        switch (jalurMasuk) {
            case "I":
                if (pendapatan < 2000000) {
                    DSP = 5000000;
                    SPP = 500000;
                    golonganPendapatan = 'A';
                    }
                else if (pendapatan >= 2000000 && pendapatan <=10000000) {
                    DSP = 15000000;
                    SPP = 1000000;
                    golonganPendapatan = 'B';
                    }
                else {
                    DSP = 30000000;
                    SPP = 2000000;
                    golonganPendapatan = 'C';
                    }

                break;
                
            case "II":
                if (pendapatan < 2000000) {
                    DSP = 7000000;
                    SPP = 500000;
                    golonganPendapatan = 'A';
                    }
                else if (pendapatan >= 2000000 && pendapatan <=10000000) {
                    DSP = 17000000;
                    SPP = 1000000;
                    golonganPendapatan = 'B';
                    }
                else {
                    DSP = 35000000;
                    SPP = 2000000;
                    golonganPendapatan = 'C';
                    }

                break;

            case "III":
                if (pendapatan < 2000000) {
                    DSP = 10000000;
                    SPP = 1000000;
                    golonganPendapatan = 'A';
                    }
                else if (pendapatan >= 2000000 && pendapatan <=10000000) {
                    DSP = 25000000;
                    SPP = 200000;
                    golonganPendapatan = 'B';
                    }
                else {
                    DSP = 50000000;
                    SPP = 3000000;
                    golonganPendapatan = 'C';
                    }
    
                break;

                default:
                    System.out.println("Pilihan anda tidak valid");
                    DSP = 0;
                    SPP = 0;
                    golonganPendapatan = '-';
                break;

        }

        totalBayar = DSP + (bulan*SPP);

        System.out.println("Golongan Pendapatan: "+ golonganPendapatan);
        System.out.println(" DSP: Rp "+ DSP);
        System.out.println(" SPP: Rp "+ SPP);
        System.out.println("Jumlah bulan yang dibayarkan: "+ bulan);
        System.out.println("Total Bayar: RP "+ totalBayar);

    }
    
}
