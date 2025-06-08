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
public class Rectangle {
    private int length; //instance variable
    private int width;  //instance variable
    
    public Rectangle(int l,int w) //constructor
    {
    length=l;
    width=w;
    }
    
    public int getArea()
    {
     return length * width;  
    }
    
    public int getPeri()
    {
       return 2 *(length + width);
    }
    
    public static void main (String [] args) //main method
    {
    Rectangle rec = new Rectangle(2,4);
        System.out.println("Area of Rectangle: "+rec.getArea());
        
    Rectangle rec1 =new Rectangle(4,3);
        System.out.println("Area of Rectangle: "+rec1.getArea());
        System.out.println("Perimeter of Rectangle: "+rec1.getPeri());
    
    }
}
