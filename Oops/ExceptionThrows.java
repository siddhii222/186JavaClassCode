public class ExceptionThrows {
    public static void main(String[] args) {
        try{
            Example e = new Example(0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}

class Example{
    int salary;

    Example(int salary) throws IllegalArgumentException{
        if(salary <=0){
            throw new IllegalArgumentException("salary must be positive");//actual throw
        }
        this.salary = salary;
        System.out.println(salary);
    }
}
