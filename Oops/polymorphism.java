public class polymorphism {
    public static void main(String[] args) {
        // EmployeePoly ep = new EmployeePoly();
        // ep.Emp_name = "Arun";
        // ep.details();
        // ep.details(50000);
        // ep.details("Kiet");

        faculty f = new faculty();
        f.Emp_name="Anuj";
        f.details(); //calling the details method
    }
}
//parent class
class EmployeePoly{
    String  Emp_name;

    //METHOD OVERLOADING/STATIC BONDING/EARLY BINDING/ COMPILE - TIME POLYMORPHISM  
    void details(){
        System.out.println("Name : " + Emp_name);
    }
    //we hv three methods of same name , but both do diff work
    void details(int Salary){
        System.out.println("Salary : " + Salary);
    }
    void details(String company){
        System.out.println("Company : " + company);
    }

}
//child class
class faculty extends EmployeePoly{
    //method overriding // RUN-TIME POLYMORPHISM // DYNAMIC BINDING
    void details(){
        super.details(); //super tells that this detailed method called will be of super class!
        System.out.println("Welcome faculties");
        
    }

}

//ABSTRACTION
//BACKGROUND IMPLEMENTATION KO HIDE KARNA, BAS OUTPUT USER KO SHOW HOGA
