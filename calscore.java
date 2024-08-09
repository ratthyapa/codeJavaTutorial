public class calscore {
    public void calscore(){
        double score = Math.random()*100;
        System.out.println("Score is " +score);
        if(score >= 80){
            System.out.println("Grede is A");
        }else if (score >= 70){
            System.out.println("grede is B");
        }else{
            System.out.println("Grede is C");
        }
    }
}
