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
public class soalno2 {
    public static void main(String[] args){
        int x;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukan Angka = ");
        x = keyboard.nextInt();
        
        if (x%2==0){
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
    
    }
}
