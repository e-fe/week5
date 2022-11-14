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

public class exp2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("VİZE NOTU");
            x = input.nextInt();
            System.out.println("FİAL NOTU");
            y = input.nextInt();
        } while (x < 0 || x > 100 || y < 0 || y > 100);
        double ort = (x * 40) / 100 + (y * 60) / 100;
        System.out.println(ort);
        if (80 <= ort && ort <= 100) {
            System.out.println("A ALDINIZ");
            }
        if (60 <= ort && ort < 79) {
            System.out.println("B ALDIN");
            }
        if (50 <= ort && ort < 59) {
                System.out.println("C ALDIN");
            }
        if (0 < ort && ort <= 49) {
                System.out.println("D ALDINIZ  KALDIN ");
            }

        }
    }


