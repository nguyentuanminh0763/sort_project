/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Validation;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    Validation v = new Validation();
    
    public Menu(){
        mChon = new ArrayList<>();
    }
    
    public Menu(String td, String[] mc){
        title = td;
        mChon = new ArrayList<>();
        for (String string : mc) {
            mChon.add((T) string);
        }
    }
    
    public void display(){
        System.out.println(title);
        System.out.println("-------------------------");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i+1) + "." + mChon.get(i));
        }
        System.out.println("-------------------------");
    }
    
    public int getSelected(){
        display();
        return v.getIntData("Enter your choice: ", 1, mChon.size() + 1);
    }
    
    public abstract void excecute(int n);
    
    public void run(){
        while(true){
            int n = getSelected();
            excecute(n);
            if(n > mChon.size()){
                break;
            }
        }
    }
    
}
