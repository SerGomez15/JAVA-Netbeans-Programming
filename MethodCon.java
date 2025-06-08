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
public class MethodCon {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int Arrval[] = new int[5]; //local variable
        
        for(int x=0;x<Arrval.length;x++) //input Array values
        {
            System.out.print("Enter element: ");
            Arrval[x]=in.nextInt();
        }
        
        ConsCon c = new ConsCon(Arrval);
        int max = c.getMax();
        System.out.println("Highest value: "+max);
        
        System.out.println("Lowest value: "+c.getMin());
        
        System.out.println("Average: "+c.getAve());
        
        
        
    }
}
