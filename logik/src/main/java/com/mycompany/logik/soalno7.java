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
public class soalno7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        int a=0;
        double y;
        System.out.print("Masukan Angka = ");
//        biar tidak terjadi bug
        System.out.println("");
        x = keyboard.nextInt();
//        System.out.print("Masukan Angka = ");
////        biar tidak terjadi bug
//        System.out.println("");
//        y = keyboard.nextDouble();
        Double[] n=new Double[x];
         for (int i=0;i <n.length;i++){
            System.out.println("Angka "+i+" : ");
            n[i]=keyboard.nextDouble();
        }
for (int i = 0; i < n.length; i++) { 
  for (int j = i + 1 ; j < n.length; j++) {
     if (n[i].equals(n[j])) { 
          a += 1;
     } else {
         a += 0;
     }
  }
}
if (a == 1){
    System.out.println("ADA");
}else {
    System.out.println("TIDAK ADA");
}
      }
    }