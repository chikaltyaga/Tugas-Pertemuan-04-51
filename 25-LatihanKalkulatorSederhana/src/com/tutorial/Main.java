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
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b= ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        // operator tersedia * / + -

        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
    }
    
    }
}
