/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Validation;
import Model.Element;
import View.Menu;

/**
 *
 * @author DELL
 */
public class SortProgramming extends Menu<String> {

    static String[] mc = {"Bubble Sort", "Quick Sort", "Exit"};

    protected Validation validation;
    protected Algorithm algorithm;
    protected int[] array;
    protected int sizeArray;

    public SortProgramming(Element element) {
        super("Programming", mc);
        validation = new Validation();
        algorithm = new Algorithm();
        sizeArray = element.getSizeArray();
        array = element.getArray();

    }

    @Override
    public void excecute(int n) {
        switch (n) {
            case 1: {
                bubbleSort();
                break;
            }
            case 2: {
                quickSort();
                break;
            }
            case 3: {
                System.exit(0);
            }

        }

    }

    public void bubbleSort() {
        System.out.println("Array before sorting: ");
        validation.display(array);
        algorithm.bubbleSort(array);
        System.out.println("\nArray after sorting: ");
        validation.display(array);
        System.out.println("");
     
    }

    public void quickSort() {
        System.out.println("Array before sorting: ");
        validation.display(array);
        algorithm.quickSort(array, 0, sizeArray - 1);
        System.out.println("\nArray after sorting: ");
        validation.display(array);
        System.out.println("");
        
    }

}
