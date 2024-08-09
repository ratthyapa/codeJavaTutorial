public class ConstructorDemo {
    public static void main(String[] args) {
        ContRectangle boxA = new ContRectangle(8.0, 12.0);
        ContRectangle boxB = new ContRectangle();
        
        System.out.println("Box A's length is: " + boxA.getLength());
        System.out.println("Box A's width is: " + boxA.getWidth());
        System.out.println("Box A's area is: " + boxA.getArea());
        System.out.println("Box B's length is: " + boxB.getLength());
        System.out.println("Box B's width is: " + boxB.getWidth());
        System.out.println("Box B's area is: " + boxB.getArea());
    }
}