/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logik;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class soalno5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        double y;
        System.out.print("Masukan Angka = ");
//        biar tidak terjadi bug
        System.out.println("");
        x = keyboard.nextInt();
        Double[] n=new Double[x];
         for (int i=0;i <n.length;i++){
            System.out.println("Angka "+i+" : ");
            n[i]=keyboard.nextDouble();
        }
         y = n[0];
         
         for(int p = 0; p < x; p++) {
         if (n[p] > y){
         y = n[p];
      }
    }
         System.out.println("Angka terbesar adalah = "+y);
    
}
}