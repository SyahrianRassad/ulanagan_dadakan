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
public class no8 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n[] = {0,0,0,0,0};
        int maks=0, i=0;
        String hasil="";
        
        System.out.print("Input jumlah Durian >");
        n[0] = scan.nextInt();
        
        System.out.print("Input jumlah Aple >");
        n[1] = scan.nextInt();
        
        System.out.print("Input jumlah Mangga >");
        n[2] = scan.nextInt();
        
        System.out.print("Input jumlah Jeruk >");
        n[3] = scan.nextInt();
        
        System.out.print("Input jumlah Pepaya >");
        n[4] = scan.nextInt();
    
        do{
            maks = Math.max(maks, n[i]);
            i++;
        }while(i<5);
        if(maks == n[0]){
            hasil = "Durian";
        }else if(maks == n[1]){
            hasil = "Aple";
        }else if(maks == n[2]){
            hasil = "Mangga";
        }else if(maks == n[3]){
            hasil = "Jeruk";
        }else if(maks == n[4]){
            hasil = "Pepaya";
        }
        System.out.println(hasil);
    }
}
