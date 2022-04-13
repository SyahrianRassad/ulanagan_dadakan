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
public class no4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[] n = {0, 0, 0, 0, 0};
        
        for(int i=0;i<5;i++){
            System.out.print("Input angka >");
            n[i] = scan.nextInt();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            sisa(n[i]);
        }
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
