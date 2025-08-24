public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;

    EmployeeCopyConstructor(int i,String name){
        Emp_id = i;
        Emp_name = name;
    }

    EmployeeCopyConstructor(EmployeeCopyConstructor emp1){
        Emp_id = emp1.Emp_id;
        Emp_name = emp1.Emp_name;
    }
    void printinfo(){
        System.out.println("Details of the Employee are: " + Emp_id + " and " + Emp_name);
    }

    public static void main(String[] args) {
        EmployeeCopyConstructor emp1 = new EmployeeCopyConstructor(10, "riya");
        emp1.printinfo();
        EmployeeCopyConstructor copy; //shallow copy
        copy = emp1; //here only ref is changed, no copy created.
        copy.printinfo();

        copy.Emp_id = 2;//copy made
        copy.Emp_name = "Siya";
        System.out.println("Changed Details : ");
        copy.printinfo();

        EmployeeCopyConstructor copy2 = new EmployeeCopyConstructor(emp1);
        //deep copy --made clone!
        copy2.printinfo();
        copy2.Emp_id = 25;
        copy2.Emp_name = "Aman";
        copy2.printinfo();
    }

    //using same constructor for diff diff tasks is called constructor-overloading!
}
