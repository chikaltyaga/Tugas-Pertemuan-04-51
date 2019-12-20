/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.*;
/**
 *
 * @author STMIK SUMEDANG
 * Nama     :Chikal Tyaga
 * NIM      :A2.1900030
 * Kelas    :TI-1C
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        tampilkanKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
