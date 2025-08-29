public class InterfaceExample {
    public static void main(String[] args) {
        institute ii;
        ii = new ABES();
        ii.register();
        ii.infrastructure();
        //cg.medicalFacility();
        ii.staff();
        ii.students();

        //calling ststic method it does not need ii || it does not need any object
        institute.staticConcrete();
        ii.defConcrete();
    }
}

interface institute{
     void register(); 
     void infrastructure();
     void students();
     void staff();

     static void staticConcrete(){
        System.out.println("Static Concrete method inside interface");
     }
     default void defConcrete(){
        privConcrete(); //bcs priv ko static ke andar call nhi karskte
        System.out.println("Default concrete method inside interface");
     }
     private void privConcrete(){
        System.out.println("Private Concrete method inside interface");
     }

    // void medicalFacility(){
    //     System.out.println("Medical Facilities are optional");
    // }//concrete method - not there in interface
}

class ABES implements institute{ //implements use hota h interface me!!
        public void register(){
            System.out.println("KIET is regstd with AKTU");
        }
        public void infrastructure(){
            System.out.println("KIET has digital classrooms and labs");
        }
        public void students(){
            System.out.println("admissions through counselling");
        }
        public void staff(){
            System.out.println("well trained staff");
        }
        public void medicalFacility(){
            System.out.println("medical facilities are there");
        }
}
