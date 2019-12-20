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
// switch case
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");
    }
    
}
