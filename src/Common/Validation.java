/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validation {
    static Scanner sc = new Scanner(System.in);
    
    public int getIntData(String msg, int minValue, int maxValue) {
        int data = 0;

        if (minValue > maxValue) {
            int temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }

        while (true) {
            try {
                System.out.print(msg);
                data = sc.nextInt();
                if (data >= minValue && data <= maxValue) {
                    break;
                } else {
                    System.out.println("An error happens because the value < " + minValue + " or > " + maxValue + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error happens because  the integer number format is invalid\n");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return data;
    }
    
    public int[] createArray(int sizeArray){
        int [] array = new int [sizeArray];
        Random rd = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
    
    public void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i < array.length -1 ){
                System.out.println(array[i] + ", ");
            }else{
                System.out.println(array[i]);
            }
        }
        System.out.println("");
    }
}
