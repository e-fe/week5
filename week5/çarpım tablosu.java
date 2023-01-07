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

public class exp4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int b = 1; b < 10; b++) {
            System.out.println("------");
            for (int i = 1; i < 10; i++) {
                System.out.println(i+"*"+b+"="+b*i);
                
            }
            
        }
    }
}
