/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

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
        // break, continue, dan return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7){
                return;
            }

            System.out.println("looping ke - " + a);

        }

        System.out.println("akhir dari looping");

    }
    
}
