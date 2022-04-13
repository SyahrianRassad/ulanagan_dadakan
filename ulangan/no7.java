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
public class no7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n[] = {0,0,0,0,0};
        int i=0;
        String hasil="TIDAK ADA";
        
        for(int c=0;c<5;c++){
            System.out.print("Input angka >");
            n[c] = scan.nextInt();
        }
        do{
            if(i == 0){
                if(n[1] == n[i])hasil = "ADA";
                if(n[2] == n[i])hasil = "ADA";
                if(n[3] == n[i])hasil = "ADA";
                if(n[4] == n[i])hasil = "ADA";
            }else if(i == 1){
                if(n[0] == n[i])hasil = "ADA";
                if(n[2] == n[i])hasil = "ADA";
                if(n[3] == n[i])hasil = "ADA";
                if(n[4] == n[i])hasil = "ADA";
            }else if(i == 2){
                if(n[0] == n[i])hasil = "ADA";
                if(n[1] == n[i])hasil = "ADA";
                if(n[3] == n[i])hasil = "ADA";
                if(n[4] == n[i])hasil = "ADA";
            }else if(i == 3){
                if(n[0] == n[i])hasil = "ADA";
                if(n[2] == n[i])hasil = "ADA";
                if(n[1] == n[i])hasil = "ADA";
                if(n[4] == n[i])hasil = "ADA";
            }else if(i == 4){
                if(n[0] == n[i])hasil = "ADA";
                if(n[2] == n[i])hasil = "ADA";
                if(n[3] == n[i])hasil = "ADA";
                if(n[1] == n[i])hasil = "ADA";
            }
            
            i++;
        }while(i < 5);
        
        System.out.println("Hasil : "+ hasil);
    }
}
