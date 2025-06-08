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


class StudInfo{ //Class A(parent) = Class B (child)
   String fullname; 
   String address;
   int age;
}

class StudGrade extends StudInfo{ //Class B (parent) = Class C(child)
    float midterm;
    float finals;
    float grdave;  
}

class ParentInfo extends StudGrade{ //Class C
    String gcont;
}
public class CCSRecord {
    public static void main (String [] args){
    
        StudGrade sg= new StudGrade(); //object1
        sg.fullname="rose ann malaborbor";
        sg.address="calamba";
        sg.age=20;
        sg.midterm=90.90f;
        sg.finals=95.95f;
        
        sg.grdave=(sg.midterm + sg.finals)/2;
        
        System.out.printf("From Student Grade Class: Student Name:%s Address:%s Age:%d Average:%.2f\n",sg.fullname,sg.address,sg.age,sg.grdave );
        
        ParentInfo p = new ParentInfo();
        
        p.fullname="Edison Esberto";
        p.gcont="Jane Esberto";
        
        System.out.println("From Parent Info Class: Student Name: "+p.fullname+"Parent Name: "+p.gcont);
        
        
    }
}
