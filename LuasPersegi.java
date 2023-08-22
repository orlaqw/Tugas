/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luaspersegi;

import java.util.Scanner;

/**
 *
 * @author orla
 */
public class LuasPersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi: ");
        int sisi = input.nextInt();
        int luas= sisi*sisi;
        
        System.out.println("Luas persegi dengan sisi " + sisi+" adalah " +luas);
        
    }
    
}
