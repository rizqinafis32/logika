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
public class soalno1 {
    public static void main(String[] args)
    {
    int x;
    int y;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Angka 1 = ");
    x = keyboard.nextInt();
    System.out.println("Angka 2 = ");
    y = keyboard.nextInt();
    
    if (x > y){
        
        System.out.println("Angka terbesar adalah "+x);
    }else {
    System.out.println("Angka terbesar adalah "+y);
    }

    
    }
}
