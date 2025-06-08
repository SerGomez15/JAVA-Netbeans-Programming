/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediateprog;

/**
 *
 * @author San Malaborbor
 */
class Rectangle{ //parent class
    int length,width,area,peri;
    
    public void InputVal(int l,int w){
        length=l;
        width=w;
    }
}

class Area1 extends Rectangle{ //child1 class
    public int getArea(){
        area=length * width;
        return area;
    }
}

class Peri extends Rectangle{ //child2 class
    public int getPeri(){
        peri=2 * (length + width);
        return peri;
    }
}
public class HierarchicalSample2 {
    public static void main (String [] args){
        Area1 a = new Area1(); //object child1 class
        a.InputVal(5, 3);
        System.out.println("Area: "+a.getArea());
        
        Peri p = new Peri();
        p.InputVal(6, 3);
        System.out.println("Perimeter: "+p.getPeri());
        
        
        
    }
}
