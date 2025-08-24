package Kiet;

public class EmployeeKiet {
    public String Emp_name;
    private int salary;
    protected int Emp_id;
    String organisation; //default as its not mentioned


    public void employeeDetails(){
        System.out.println("Deatils of kiet employees are : " + Emp_id +" " +Emp_name + " " + salary + " " +organisation);
    }

    //ACESSING WITHIN A SAME CLASS - All 4 possible       
    public static void main(String[] args) {
        EmployeeKiet ek =  new EmployeeKiet();
        ek.Emp_id = 1;
        ek.Emp_name = "shiv";
        ek.salary = 500000;
        ek.organisation = "KIET";

        ek.employeeDetails();
    }

}
