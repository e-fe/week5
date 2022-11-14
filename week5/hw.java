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

public class hw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KAÇ YILDIZLA BAŞLASIN");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = i; j <= x; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}


