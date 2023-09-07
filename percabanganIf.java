import java.util.Scanner;

public class percabanganIf

//Orla Qadira W.

{
public static void main(String[] args){
    
Scanner input = new Scanner (System.in);


// if

// Pernyataan if mempunyai pengertian “jika kondisi
// bernilai benar, maka (pernyataan) perintah akan
// dikerjakan dan jika tidak memenuhi syarat maka
// program akan diabaikan".

//Contoh:

// System.out.println("Masukkan jumlah pembelanjaan: ");
// double totalBelanja = input.nextDouble();
// double diskon = 0;

// if(totalBelanja > 500000){
//     diskon = 0.1 * totalBelanja;
// }

// totalBelanja -=diskon;
// System.out.println("Total Belanja: " + totalBelanja);
// System.out.println("Diskon: " + diskon);



// if else

// Pernyataan if else mempunyai pengertian “jika kondisi
// benar, maka pernyataan-1 akan dikerjakan, dan jika
// tidak memenuhi syarat maka akan mengerjakan
// pernyataan-2”.

//Contoh:

System.out.println("Masukkan Nilai");
int nilai = input.nextInt();

if (nilai > 75){
    System.out.println("Lulus");
}else{
    System.out.println("Tidak Lulus");
}






}
}