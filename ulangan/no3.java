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
public class no3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a=0;
        int k;
        int hasil=0;
        
        System.out.print("Input angka >");
        a = scan.nextInt();
        
        for(int i=1;i<a;i++){
            k = a-(a-i);
            System.out.print(k+" + ");
            hasil = hasil + k;
        }
        hasil = hasil + a;
        System.out.println(a+" = "+hasil);
    }
}
