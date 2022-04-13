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
public class soalno4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        System.out.print("Masukan Angka = ");
        System.out.println("");
        x = keyboard.nextInt();
        Double[] n=new Double[x];
        
        for (int i=0;i <n.length;i++){
            System.out.println("Angka "+i+" : ");
            n[i]=keyboard.nextDouble();
        }
        for (int i=0;i <n.length;i++){
            if (n[i]%2==0){
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
        }
    
    
    }
}
