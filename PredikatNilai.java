package percabangan;
import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nilai dan Predikat");

        System.out.println("Masukkan nilai PAI: ");
        int pai = input.nextInt();

        System.out.println("Masukkan nilai PKN: ");
        int pkn = input.nextInt();

        System.out.println("Masukka nilai Bhs Indonesia: ");
        int bin = input.nextInt();

        System.out.println("Masukkan nilai Bhs Inggirs: ");
        int big = input.nextInt();

        System.out.println("Masukkan nilai Matematika");
        int mtk = input.nextInt();

        String predikat = null;

        int ratarata = (pai+pkn+bin+big+mtk) / 5;

        if (ratarata <= 100 && ratarata >= 80) {
            predikat = "A";
        }
        else if (ratarata <= 80 && ratarata >= 60) {
            predikat = "B";
        }
        else if (ratarata <= 60 && ratarata >= 50) {
            predikat = "C";
        }
        else if (ratarata <= 50 && ratarata >= 45) {
            predikat = "D";
        }
        else if (ratarata <= 45 && ratarata >= 25) {
            predikat = "E";
        }
        else {predikat = "f";
        }

        System.out.println("\nNilai rata-rata: "+ratarata);
        System.out.println("Predikat: "+ predikat);

    }
}
