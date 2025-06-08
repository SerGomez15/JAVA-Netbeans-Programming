/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediateprog;

import java.util.Scanner;

/**
 *
 * @author San Malaborbor
 */

class Value{ //parent class
    int length;
    int width;
    int area;
    
    public void InputVal(int l,int w){ //method
        length=l;
        width=w;
    }    
}

class AreaRec extends Value { //child class
    public int ComputeArea(){
        area=length * width;
        return area;
    }
}
public class Area {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        
        AreaRec a = new AreaRec(); //object should be the child class
        
        System.out.print("Enter length: ");
        a.length=in.nextInt();
        
        System.out.print("Enter width: ");
        a.width=in.nextInt();
        
        a.InputVal(a.length, a.width); //call the method of parent class
        int are= a.ComputeArea(); //call the method of child class
        
        System.out.println("Area of Rectangle is "+are);
  
    }
}
