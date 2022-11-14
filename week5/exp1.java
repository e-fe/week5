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

public class exp1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        do {
            System.out.println("pozitif SAYI GİR");
        x = input.nextInt();

        } while (x < 0);
        System.out.println("GİRİLEN SAYI POZİTİFTİR : "+x);

    }
}


