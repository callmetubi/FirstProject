public class TASK3 {
    public static void main(String[] args) {

        int randomNumber = (int)(Math.random()*100)+1;

        String result= (randomNumber %2==0)? "even" :"odd";

        System.out.println("Generated random number: " +randomNumber);
        System.out.println("The random number is " +  result +".");
    }
}

