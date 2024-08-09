public class ContRectangle {
    private double length;
    private double width;

    
    public ContRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public ContRectangle() {
        this.length = 8.0;
        this.width = 12.0;
    }

    
    public double getLength() {
        return length;
    }

   
    public double getWidth() {
        return width;
    }

    
    public double getArea() {
        return length * width;
    }
}

