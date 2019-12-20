/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.Arrays;
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
       int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));


        ubahArray(arrayAngka1);
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
    }
    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value

    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
    
}
