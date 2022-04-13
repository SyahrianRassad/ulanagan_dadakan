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
public class no2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a =0;
        
        System.out.print("Input angka >");
        a = scan.nextInt();
        sisa(a);
    }
    
    static void sisa(int a){
        int n = a%2;
        if(n == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
