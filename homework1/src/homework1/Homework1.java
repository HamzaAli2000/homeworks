/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1;

import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aliha
 */
public class Homework1 {

    public static String equals(int arr1[], int arr2[]) {
        boolean areEqual = Arrays.equals(arr1, arr2);
        return ("Array1 and Array2 are " + (areEqual ? "equal" : "not equal"));
    }

    public static ArrayList clonedArrays(int arr1[]) {
        ArrayList<Integer> clonedArray = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            clonedArray.add(arr1[i]);
        }

        return clonedArray;
    }

    public static ArrayList remove(int arr1[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arrayList.add(arr1[i]);
        }
        arrayList.removeAll(arrayList);

        return arrayList;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Q number: ");
        int choice = input.nextInt();
        if (choice == 1) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {1, 2, 3, 4, 5};
            System.out.println(equals(arr1, arr2));;
        } else if (choice == 2) {
            int[] arr1 = {1, 2, 3, 4, 5};
            System.out.println("Original array: " + Arrays.toString(arr1));
            System.out.println("Modified array: " + clonedArrays(arr1));
        } else if (choice == 3) {
            int[] arr1 = {1, 2, 3, 4, 5};
            System.out.println("Original array: " + Arrays.toString(arr1));
            System.out.println("Modified array: " + remove(arr1));
            
        }
    }

}
