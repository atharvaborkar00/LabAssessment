package Task2.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    int empID;
    String name;

    public Employee(int empID, String name){
        this.empID = empID;
        this.name = name;
    }
}
