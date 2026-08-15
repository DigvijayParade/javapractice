public class Parent1{

    static void main() {

        Parent1 obj = new Parent1();
        System.out.println("calling the parents method");
        obj. m1();
        
        Parent1 obj1 = new Child1();
        System.out.println("Calling the childs overriden method ");
        obj1. m1();
    }
        void m1(){
           
            System.out.println("Paents meth");

        }


}

class Child1 extends Parent1{

    @Override
    void m1(){

        System.out.println("Childs meth");
    }

    void m2(){}
}

