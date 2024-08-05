import java.util.*;
public class PayArray {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double PayRatge;
        double grossPay;
        int [] hours = new int [EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours worked by " +EMPLOYEES+ "emloyees who all aren");
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.println("Employee #" +(index +1)+ ":");
            hours[index] = in.nextInt();
        }
        System.out.println("Enter the hourly pay rate for each employee:");
        PayRatge =  in.nextDouble();
        for(int index =0; index < EMPLOYEES; index++){
            grossPay = hours[index]+PayRatge;
            System.out.println("Eloyee# " +(index +1) + ":$"+grossPay);
        }
    }
}
