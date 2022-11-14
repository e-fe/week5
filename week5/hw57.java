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
public class hw57 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("7 DEN BÜYÜK SAYI GİR");
        int x = input.nextInt();
        if(x<=7){
            System.out.println("HATALI SAYU");
        }else{
            boolean deger;
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    if(x==3*i+5*j){
                        if (i!=j) {
                            System.out.println(i+"*3 + "+j+"*5");
                        }else{
                            System.out.println(i+"*3 + "+j+"*5");
                        }
                    }else{
                        deger = false;
                    }
                    
                }
                
            }
        }
        
    }
    
}
