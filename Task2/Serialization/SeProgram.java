package Task2.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class SeProgram {
    public static void main(String[] args) {
        try{
            Employee emp1 = new Employee(26, "Atharva");
            Employee emp2 = new Employee(34, "James");
            Employee emp3 = new Employee(95, "Natasha");
    
            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
    
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.writeObject(emp3);
            out.flush();
    
            out.close();
            System.out.println("Objects Serialized Successfully");
        }catch(Exception e){System.out.println(e);}
    }
}
