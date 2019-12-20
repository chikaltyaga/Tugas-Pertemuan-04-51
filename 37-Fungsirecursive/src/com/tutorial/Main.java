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
        System.out.print("masukan nilai:");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);


        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
    }
    // fungsi rekursif sederhana

    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);

    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);

    }

    private static void printNilai (int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }
    
}
