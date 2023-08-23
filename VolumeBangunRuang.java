/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumebangunruang;

/**
 *
 * @author orla
 */import java.util.Scanner;
public class VolumeBangunRuang {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        
        //Menghitung volume bangun ruang
        //a. Bola v= 3/4 x π x r3
    
        Scanner inputBola = new Scanner(System.in);
        
        System.out.println("Masukkan jari-jari bola: ");
        double jariJari = inputBola.nextDouble();
        
        double phi = 3.14;
        double volumeBola = 4/3 * phi * jariJari * jariJari;
        System.out.println("Volume bola adalah " + volumeBola);
        
        //b. Tabung 
        //Tabung v= π x r x r x t
        
        Scanner inputTabung = new Scanner(System.in);
        
        System.out.println("Masukkan Jari-jari tabung: ");
        double jariJari2 = inputTabung.nextDouble();
        
        System.out.println("Masukkan tinggi tabung");
        double tinggi = inputTabung.nextDouble();
        
        double phi2 = 3.14;
        double volumeTabung = phi2 * jariJari2 * jariJari2 * tinggi;
        
        System.out.println("Volume tabung adalah " + volumeTabung);
        
        //c. Kerucut
        //Kerucut v= 1/3 x π x r x r x t
        
        Scanner inputKerucut = new Scanner(System.in);
        
        System.out.println("Masukkan jari-jari kerucut: ");
        double jariJari3 = inputKerucut.nextDouble();
        
        System.out.println("Masukkan tingi kerucut");
        double tinggi2 = inputKerucut.nextDouble();
        
        double phi3= 3.14;
        double volumeKerucut = phi3 * jariJari3 * jariJari3 * tinggi2;
        
        System.out.println("Volume kerucut adalah " + volumeKerucut);
                
                
    }
    
}
