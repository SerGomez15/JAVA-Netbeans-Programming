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
public class Person { //class declaration
  private String Fullname;
  private String Course;
  private int age;
    
  public Person(String Fullname,String Course)
  {
   this.Fullname=Fullname;
   this.Course=Course;   
  }
  
  public Person(int age)
  {
   this.age=age;
  }
  
    public Person(String Fullname,String Course,int age)
  {
   this.Fullname=Fullname;
   this.Course=Course;   
   this.age=age;
  }
  
    public static void main (String [] args) //MAIN method
    {

    }
}
