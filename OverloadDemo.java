public class OverloadDemo {
    int x;

    
    OverloadDemo() {
        System.out.println("Inside OverloadDemo().");
        x = 0;
    }

    
    OverloadDemo(int i) {
        System.out.println("Inside OverloadDemo(int).");
        x = i;
    }

    
    OverloadDemo(double d) {
        System.out.println("Inside OverloadDemo(double).");
        x = (int) d;
    }

    public static void main(String[] args) {
        OverloadDemo obj1 = new OverloadDemo();      
        OverloadDemo obj2 = new OverloadDemo(10);   
        OverloadDemo obj3 = new OverloadDemo(10.5); 
    }
}