import java.util.Scanner;

public class nilai {
    
//Orla Qadira W./ 28/ X RPL 8

    public static void main(String[] args){
Scanner input = new Scanner (System.in);


System.out.println("Masukkan Nama");
String nama = input.nextLine();


System.out.println("Masukkan Nilai "+nama);
int nilai = input.nextInt();


String predikat = null;
String kategori = null;


//96-100
if(nilai > 96 && nilai <= 100){
    predikat = "A+";
    kategori = "sangat baik";
}

//91-95
else if(nilai > 90 && nilai <= 95){
    predikat = "A-";
    kategori = "sangat baik";
}

//86-90
if(nilai > 86 && nilai <= 90){
    predikat = "B+";
    kategori = "baik";
}

//81-85
else if(nilai > 81 && nilai <= 85){
    predikat = "B";
    kategori = "baik";
}
//75-80
else if(nilai > 75 && nilai <= 80){
    predikat = "B-";
    kategori = "baik";
}

//70-74
if(nilai > 70 && nilai <= 74){
    predikat = "C+";
    kategori = "cukup";
}

//65-69
else if(nilai > 65 && nilai <= 69){
    predikat = "C";
    kategori = "cukup";
}

//60-64
else if(nilai > 60 && nilai <= 64){
    predikat = "C-";
    kategori = "cukup";
}

//55-59
if(nilai > 55 && nilai <= 59){
    predikat = "D+";
    kategori = "kurang";
}

//0-54
else if(nilai > 0 && nilai <= 54){
    predikat = "D";
    kategori = "kurang";
}

System.out.println("Nama: "+ nama);
System.out.println("Nilai: "+nilai);
System.out.println(predikat);
System.out.println(kategori);

}
}