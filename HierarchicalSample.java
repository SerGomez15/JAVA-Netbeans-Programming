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

class Person{ //parent class
    protected String fname;
    protected int age;
    
    public void setInfo(String n,int a){ //input Information
        fname=n;
        age=a;
    }
    
    public void getInfo(){ //output information
        System.out.println("Firstname: "+fname);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{ //first child
    public int marks;
    
    public void setStudInfo(String sn,int sa,int m){ //input Student record
        setInfo(sn,sa); //to input values for firstname and age
        marks=m; 
    }
    
    public void getStudInfo(){
        System.out.println("Student Record "); //output Student record
        getInfo(); //to display firstname and age of student
        System.out.println("Marks: "+marks);
    }
}

class Teacher extends Person{ //second child
    public int salary;
    
    public void setTeacherInfo(String tn,int ta,int sal){ //input Teacher record
        setInfo(tn,ta);
        salary=sal;
    }
    
    public void getTeacherInfo(){
        System.out.println("Faculty Record ");
        getInfo(); //display firstname and age of teacher
        System.out.println("Salary: "+salary);
        
    }
}
public class HierarchicalSample {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        
        Student s = new Student(); //object of student class
        
        System.out.print("Enter student firstname: ");
        s.fname=in.next();
        System.out.print("Enter student age:");
        s.age=in.nextInt();
        System.out.print("Enter student mark: ");
        s.marks=in.nextInt();
        
        s.setStudInfo(s.fname, s.age, s.marks);
        s.getStudInfo();
        
        Teacher t = new Teacher();
        
        System.out.print("Enter teacher firstname: ");
        t.fname=in.next();
        System.out.print("Enter teacher age: ");
        t.age=in.nextInt();
        System.out.print("Enter teacher salary: ");
        t.salary=in.nextInt();
        
        t.setTeacherInfo(t.fname, t.age, t.salary);
        t.getTeacherInfo();
        
        
        
    }
}
