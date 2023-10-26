import java.util.Scanner;
public class Ex3Task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Coefficient a: ");
        double a =scanner.nextDouble();

        if (a==0){
            System.out.println("Coefficient 'a' cannot be zero for quadratic equation.");
            scanner.close();
            return;
        }

        System.out.println("Enter Coefficient b: ");
        double b=scanner.nextDouble();

        System.out.println("Enter Coefficient c: ");
        double c=scanner.nextDouble();

        double discriminant= b*b -4*a*c;

        double x1,x2;
        int numberRoots;

        switch (numberRoots= (discriminant>0)?2 :(discriminant==0)?1:0){
            case 2://Two real roots
                x1 =(-b+Math.sqrt(discriminant))/(2*a);
                x2=(-b -Math.sqrt(discriminant))/(2*a);
                System.out.printf("x1 : %.2f%n",x1);
                System.out.printf("x2 : %.2f%n",x2);
                break;

            case 1://One real root
            x1=-b/(2*a);
                System.out.printf("Number of Roots: %d%n,",numberRoots);
                System.out.printf("x2: %.2f%n",x1);
                break;

            case 0://No real root
                System.out.println("Number of Roots: 0 (Complex Roots");
                break;

        }

        scanner.close();
    }
}
