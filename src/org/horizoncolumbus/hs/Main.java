package org.horizoncolumbus.hs;

// 1/21/2021

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] numbers = new int[] {1, 2, 3, 4, 5};

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;

        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + numbers[i];
            System.out.println(sum);
        }
    }
}
