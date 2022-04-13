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
public class no1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a=0, b=0;
        
        System.out.print("Input angka >");
        a = scan.nextInt();
        System.out.print("Input angka >");
        b = scan.nextInt();
        System.out.println("Hasil Terbesar "+Math.max(a, b));
    }
}
