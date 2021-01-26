package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int intSize = scan1.nextInt();
        int[] numbers3 = new int[intSize];
        for(int x = 0; x < intSize; x++) {
            System.out.println("Enter value[" + x + "]: ");
            numbers3[x] = scan1.nextInt();
        }
        int sum = 0;
        for(int x = 0; x < intSize; x++) {
            sum = sum + numbers3[x];
        }
        System.out.println("The sum value is: " + sum);
    }

}
