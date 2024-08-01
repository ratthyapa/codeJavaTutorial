public class result1to100 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i <=100){
            sum += i;
        System.out.println("i:" + i + ",result in whileloop:"+sum);
            i++;
        }

        System.out.println("result in whileloop 1 - 100 is :" + sum);
    }
}
