/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;
public class exp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("B DEGERİ GİR");
        int b = input.nextInt();
        for (int a = 0 ; a<100 ; a++) {
           if (b==Math.pow(a,3)-Math.pow(a,2)){
               
            System.out.println(a);
           }
            
            
        }
        
        
    
}
}
