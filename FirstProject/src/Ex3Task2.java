import java.util.Scanner;

public class Ex3Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your weight(KG): ");
        float weight=scanner.nextFloat();

        System.out.println("Enter your height(CM): ");
        float height=scanner.nextFloat() /100; //Convert height to cm

        //Calculate BMI using MathPow
        float bmi=weight/(float) Math.pow((height),2);

        //IF,ELSE

        if(bmi<16.00){
            System.out.println("BMI Category: Starvation");
        }else if(bmi<17.00){
            System.out.println("BMI Category: Emaciation");
        } else if (bmi < 18.50) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi < 23.00) {
            System.out.println("BMI Category: Normal, low range");
        } else if (bmi < 25.00) {
            System.out.println("BMI Category: Normal, high range");
        } else if (bmi < 27.50) {
            System.out.println("BMI Category: Overweight, low range");
        } else if (bmi < 30.00) {
            System.out.println("BMI Category: Overweight, high range");
        } else if (bmi < 35.00) {
            System.out.println("BMI Category: 1st degree obesity");
        } else if (bmi < 40.00) {
            System.out.println("BMI Category: 2nd degree obesity");
        } else {
            System.out.println("BMI Category: 3rd degree obesity");
        }

        scanner.close();
    }
}
