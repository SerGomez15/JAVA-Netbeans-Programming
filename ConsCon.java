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
public class ConsCon {
    int Arr[]; //instance variable
    
    
    public ConsCon(int Arr[]){ //constructor
        this.Arr=Arr; 
    }
    
    public int getMax()
    {
        int high=Arr[0]; //I will assign that index 0 is the highest value
        for(int num:Arr) //compare the elements in your Arr(array)
        {
            if(num > high) //compare the element to the assigned highest value, if num is greater than the high value then 
                high=num; // num is now the highest value else the assigned highest value is the high
        }
    return high;    //after comparing all elements,it will return the highest number
    }
    
    
}
