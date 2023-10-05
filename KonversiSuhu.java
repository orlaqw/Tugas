package percabangan;
import java.util.Scanner;

public class KonversiSuhu
//Orla Qadira Wibisono/ X RPL 8/ 28
{public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan suhu Celsius: ");

    double celsius = input.nextDouble();
   
        System.out.println("R = Reamur ");
        System.out.println("K = Kelvin ");
        System.out.println("F = Fahrenheit ");
        System.out.println("Masukkan pilihan : ");
        char pilihan = input.next().charAt(0);

    switch (pilihan){

        //Konversi ke Reamur
        case 'R':
            double reamur = celsius * 4/5;
            System.out.println("Hasil konversi Reamur: "+ reamur);
            break;

        //Konversi ke Kelvin
        case 'K':
            double kelvin = celsius * 273.15;
            System.out.println("Hasil konversi Kelvin: "+ kelvin);
            break;

        //Konversi ke Fahrenheit
        case 'F':
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Hasil konversi Fahrenheit: "+ fahrenheit);
            break;

        }

    }

}
