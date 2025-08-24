package Kiet;
public class HRDept {

    //ACESSING WITHIN ANOTHER CLASS - All 3 possible       

    public static void main(String[] args) {
        EmployeeKiet ek = new EmployeeKiet();
        ek.Emp_id=2;
        ek.Emp_name="ravi";
        //ek.salary = 53000; //not visible in another class as its PRIVATE
        ek.organisation = "KIET";

        ek.employeeDetails();
    }
}
