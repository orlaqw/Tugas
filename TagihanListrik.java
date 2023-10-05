package percabangan;
import java.util.Scanner;
public class TagihanListrik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pemakaian listrik");

        double pemakaian = input.nextDouble();

        double tarif = 0;

        if (pemakaian <= 50){
            tarif = 50;
        }
        else if (pemakaian <= 150){
            tarif = 150;
        }
        else if (pemakaian <= 250){
            tarif = 250;
        }
        else if (pemakaian >= 250)
            tarif = 300;
        else {
            System.out.println("error");
        }

        double biaya = pemakaian * tarif;
        double tambahan = biaya * 20/100;
        double total = tambahan + biaya;

        System.out.println("Biaya Pemakaian: Rp."+ biaya);
        System.out.println("Biaya Tambahan: Rp."+ tambahan);

        System.out.println("Total biaya yang dibayar: Rp. "+total);
    }
}
