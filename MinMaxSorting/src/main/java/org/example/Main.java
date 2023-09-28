package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
        static void closestVal(int[] arr) {
            Scanner input = new Scanner(System.in);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            System.out.print("Bir sayı giriniz: ");
            int temp = input.nextInt();

            int min = arr[0];
            int max = arr[0];
            int index;

            for (int i : arr) {
                if (temp < i) {
                    max = i;
                    System.out.println("Closest max value= " + max);
                    index = Arrays.binarySearch(arr, max) - 1;
                    if (temp != arr[index]) {
                        System.out.println("Closest min value= " + arr[index]);
                    } else {
                        System.out.println("Closest min value= " + arr[index - 1]);
                    }
                    break;
                }
            }

        }

    public static void main(String[] args) {
        int[] arr = {15,12,778,1,-1,-778,2,0};
        closestVal(arr);
    }

}