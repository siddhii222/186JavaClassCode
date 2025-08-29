public class AbstractExample {
    public static void main(String[] args) {
        college cg;
        cg = new KIET();
        cg.register();
        cg.infrastructure();
        cg.medicalFacility();
        cg.staff();
        cg.students();
    }
}


abstract class college{
    abstract void register(); //abs method h toh iski class bhi abs honi chaiye
    abstract void infrastructure();
    abstract void students();
    abstract void staff();

    void medicalFacility(){
        System.out.println("Medical Facilities are optional");
    }
}
    class KIET extends college{
        void register(){
            System.out.println("KIET is regstd with AKTU");
        }
        void infrastructure(){
            System.out.println("KIET has digital classrooms and labs");
        }
        void students(){
            System.out.println("admissions through counselling");
        }
        void staff(){
            System.out.println("well trained staff");
        }
        void medicalFacility(){
            System.out.println("medical facilities are there");
        }

}
