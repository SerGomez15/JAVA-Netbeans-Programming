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

class Val{ // parent class of AreaVal
    int length, width,height,area,volume;
    
    public void InputVal(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
}

class AreaVal extends Val { //child class of Val //parent class of Volume
    public int ComputeArea(){
        area=length * width;
        return area;
    }
}

class Volume extends AreaVal{ //child class of AreaVal
    public int getVolume(){
        volume=area * height;
        return volume;
    }
}

public class AreaUsingMulti {
    public static void main (String [] args){
        Scanner in =new Scanner(System.in);
        
        Volume v = new Volume();
        
        System.out.print("Enter length:");
        v.length=in.nextInt();
        
        System.out.print("Enter width:");
        v.width=in.nextInt();
        
        System.out.print("Enter height:");
        v.height=in.nextInt();
        
        v.InputVal(v.length, v.width, v.height);
        
        System.out.println("Area of Rectangle: "+v.ComputeArea());
        System.out.println("Volume of Rectangle: "+v.getVolume());
        
    }
}
