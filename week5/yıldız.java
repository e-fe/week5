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

public class exp5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SATIR");
            int sa = input.nextInt();
        System.out.println("SÜTUN");
            int su = input.nextInt();
        for (int i = 1 ;i<=sa; i++) {
            for (int j = 1;j<=su; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
