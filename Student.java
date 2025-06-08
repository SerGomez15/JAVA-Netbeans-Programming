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
public class Student {
    public static void main (String [] args)
    {
     StudRec srec = new StudRec();
     
     srec.id=1;
     srec.name="Rose";
     srec.age=20;
     srec.course="MSCS";
     
        System.out.println("Student ID: "+srec.id);
        System.out.println("Name: "+srec.name);
        System.out.println("Age: "+srec.age);
        System.out.println("Course: "+srec.course);
     
    }
}
