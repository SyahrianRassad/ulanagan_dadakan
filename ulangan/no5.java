/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class no5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n[] = {0,0,0,0,0};
        int maks=0, i=0;
        String hasil="";
        
        for(int c=0;c<5;c++){
            System.out.print("Input angka >");
            n[c] = scan.nextInt();
        }
        do{
            maks = Math.max(maks, n[i]);
            i++;
        }while(i<5);
        
        System.out.println("Nilai Terbesar : "+maks);
    }
}
