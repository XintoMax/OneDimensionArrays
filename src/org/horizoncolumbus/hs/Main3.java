package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner arraySize = new Scanner(System.in);
        System.out.println("Enter array size: ");

        String size = arraySize.nextLine(); int intSize = Integer.parseInt(size);
        for(int x = 0; x < intSize; x++) {
            if(x < intSize) {
                Scanner value = new Scanner(System.in);
                System.out.println("Enter array value: ");
                String getValue = value.nextLine(); int intValue = Integer.parseInt(getValue);
                sum += intValue;
            }
        }
        System.out.println("The sum value is: " + sum);
    }

}
