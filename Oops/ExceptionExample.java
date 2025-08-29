public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
      
        try{
              System.out.println(100/0);
              System.out.println("try block");// ye run nhi hopaega! toh isko finally block me likhenge 
        }
        catch(Exception e){
            System.out.println(e); //prints the description of exception
        }
        //try h toh catch/finally hona chaiye!
        //catch cant be used without try!
        //ek try ke sath multiple catch use hosakte h
        System.out.println(5);
        System.out.println(6);
        
    }
}
