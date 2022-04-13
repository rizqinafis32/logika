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
public class soalno3 {
    public static void main(String[] args){
        int x;
        int p;
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan Angka = ");
    x = keyboard.nextInt();
    p = x;
    int nul = 0;
    
    for (int y=1;y <=p; y++){
        System.out.print(y+" +");
        
        nul += y;
    }x = nul;
    System.out.println("="+x);
    }
    
}
