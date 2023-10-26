import java.util.Scanner;

public class Ex3Task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber=scanner.nextDouble();


        System.out.println("Enter the second number: ");
        double secondNumber=scanner.nextDouble();

        scanner.close();

        double sum=firstNumber+secondNumber;
        double difference=firstNumber-secondNumber;
        double product=firstNumber*secondNumber;

        double quotient;
        if(secondNumber !=0){
            quotient=firstNumber / secondNumber;
        }else{
            System.out.println("Quotient: Undefined (division by zero)");
            return;
        }

        System.out.printf("Sum:  %.2f\n" , sum);
        System.out.printf("Difference:  %.2f\n" , difference);
        System.out.printf("Product:  %.2f\n" , product);
        System.out.printf("Quotient:  %.2f\n" , quotient);

    }


}
