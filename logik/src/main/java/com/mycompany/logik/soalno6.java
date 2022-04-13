package com.mycompany.logik;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class soalno6 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Masukan Nilai X = ");
//        biar tidak terjadi bug
        System.out.println("");
        x = keyboard.nextInt();
        System.out.print("Masukan Nilai Y = ");
//        biar tidak terjadi bug
        System.out.println("");
        y = keyboard.nextInt();
        Double[] n=new Double[x];
        
        
         for (int i=0;i <n.length;i++){
            System.out.println("Angka "+i+" : ");
            n[i]=keyboard.nextDouble();
        }
         
         
    
}
}