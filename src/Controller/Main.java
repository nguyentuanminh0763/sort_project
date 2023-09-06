/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Validation;
import Model.Element;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Validation validation = new Validation();
        Element element = new Element();
        element.setSizeArray(validation.getIntData("Enter number of array: ", 1, 100));
        
        element.setArray(validation.createArray(element.sizeArray));
        new SortProgramming(element).run();
        
    }

}
