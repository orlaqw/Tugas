package BuAul;

import java.util.Scanner;

public class TugasInputMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Masukan banyak angka pada baris: ");
        int a = in.nextInt();

        System.out.println("Masukan banyak angka pada kolom: ");
        int b = in.nextInt();

        int matriks[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int p = i + 1;
                int q = j + 1;
                System.out.print("Masukkan angka matriks baris " + p );System.out.println(" kolom " + q);
                matriks[i][j] = in.nextInt();
            }
        }
        System.out.println("Elemen dari matriksnya adalah: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matriks[i][j] + ", ");
            }
            System.out.println();
        }

    }
    
}
