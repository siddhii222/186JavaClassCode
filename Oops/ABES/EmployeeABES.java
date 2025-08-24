package ABES;
import Kiet.*; //importing package

//import Kiet.EmployeeKiet; //do when importing a particular class

// public class EmployeeABES {
//     //ACCESSING WITHIN ANOTHER PACKAGE 
//     public static void main(String[] args) {
//         EmployeeKiet ek = new EmployeeKiet();
//         ek.Emp_name = "Aman";
//         // ek.Emp_id = 5; //protected
//         // ek.salary = 52500; //private 
//         // ek.organisation = "KIET"; //default
        
//         ek.employeeDetails();
//     }
// }


// ab agar hume protected bhi access krna h toh hum subclass bnaenge
public class EmployeeABES extends EmployeeKiet{
    //empABES ==  child, subclass
    //empKIET == parent, superclass
    public static void main(String[] args) {

    //  EmployeeKiet ek = new EmployeeKiet();  this line is not needed since we already have extended empKiet
    EmployeeABES ae = new EmployeeABES();
    ae.Emp_name = "Ram";
    ae.Emp_id = 4;  // yaha pe protected acess ho paya
    // ae.salary = 59000; // not accessible
    // ae.organisation = "KIET";
    ae.employeeDetails();


    //instance variable = puri class me visible ho
    // local variable= kisi method ke andar
    // static int m = 410; == static variable

    }
} 
