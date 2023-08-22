/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programbmi2con;

/**
 *
 * @author orla
 */
import java.util.Scanner;

public class ProgramBMI2con {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    
        System.out.println("Masukkan berat badan: ");    
        double berat = input.nextDouble();
        
        System.out.println("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();
        
        double konversiBerat = berat * 2.205;
        double konversiTinggi = tinggi / 2.54;
        
        double rumusBMI = konversiBerat / konversiTinggi * konversiTinggi * 703;
        System.out.println("BMI: " + rumusBMI);
    }
    
}
