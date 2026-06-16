package practice;
// import java.util.*;
// import java.util.Scanner;

class Teacher{
    String name;
    String department;
    double salary;
    
    // Parameterized Constructor
    Teacher(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        
    }
    
    // display
    void display(){
        System.out.println("Name       : "+name);
        System.out.println("Department : "+department);
        System.out.println("Salary     : "+salary);
        
    }
    
   
    
    
}
public class Class {
    public static void main(String[] args){
        // Creatiing an object
        Teacher t1 = new Teacher("Krishna Kumar","Computer Science",100000);
         t1.display();
    }
}
