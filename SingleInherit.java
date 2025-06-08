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

class Single{ //parent class 
    String name="Rose Ann";
    String course="MSCS";
    int age=20;   
}
public class SingleInherit extends Single { //child class
    String schoolname="NU Laguna";
    String address="Calamba City";
    
    public static void main (String [] args){
        SingleInherit si= new SingleInherit();
        
        System.out.println("Name: "+si.name);
        System.out.println("Course: "+si.course);
        System.out.println("Age: "+si.age);
        System.out.println("School Name: "+si.schoolname);
        System.out.println("Address: "+si.address);
    }
}
