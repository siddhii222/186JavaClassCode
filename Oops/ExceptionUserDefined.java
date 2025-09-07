//1. Create custom exception class
class InvalidEmployeeId extends Exception{
    InvalidEmployeeId(String message){
        super(message);
    }
}

//2. Employee class
class Emp_loyee{
 int empId;
 String name;

 Emp_loyee(int empId,String name) throws InvalidEmployeeId{
    if(empId <= 0){
        throw new InvalidEmployeeId("Employee ID must be positive");
    }
    this.empId = empId;
    this.name = name;
    System.out.println("Employee created: "+ empId + ", " + name);
 }
}

//3. Tester class
public class ExceptionUserDefined {
    public static void main(String[] args) {
        try{
            Emp_loyee e1 = new Emp_loyee(101, "Siddhi"); //valid
            Emp_loyee e2 = new Emp_loyee(102, "Shreya"); //invalid -custom
        }
        catch(InvalidEmployeeId e){
            System.out.println("Custom Exception: " + e);
        }
    }
}