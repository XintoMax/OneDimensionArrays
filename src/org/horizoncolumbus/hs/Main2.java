package org.horizoncolumbus.hs;

public class Main2 {

    public static void main(String[] args) {
        int[] numbers2 = new int[] {1, 2, 3, 4, 5};

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + numbers2[i];
        }
        String formula = "";
        for( int y = 0; y < 5; y++) {
            if(y == 4) {
                formula += numbers2[y] + " = " + sum;
            }
            else {
                formula += numbers2[y] + " + ";
            }
        }
        System.out.println(formula);
    }
}
