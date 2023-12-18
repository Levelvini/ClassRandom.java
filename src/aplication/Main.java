package aplication;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        /*int[] randomNumbers = new int[8];
        for (int i=0;i< randomNumbers.length;i++){
            int newRandom = rd.nextInt(90000000) + 10000000;
            randomNumbers[i] = newRandom;
        }
        for (int i =0;i< randomNumbers.length;i++){
            System.out.println(" numero "+ (i + 1) + " : " + randomNumbers[i] + "..");
        }*/
        int x = rd.nextInt(90000000);
        System.out.println(x);
    }
}
