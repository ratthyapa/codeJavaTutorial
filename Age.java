import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        final int Age = 20;
        int InputAge ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        InputAge =scan.nextInt();
        System.out.println("you entered :" + InputAge);
        if(InputAge<20) {
            System.err.println("you are still yong");
            System.out.println("Good bye");
        }else{
            
        }
        
 
    }
}
