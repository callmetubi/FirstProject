public class Ex3Task4 {
    public static void main(String[] args) {
        int sum =0;

        for(int i=1; i<=100; i++){
            if(i%2==0){
                sum+=1;
            }
        }
        System.out.println("Sum of even numbers froom 1 to 100 : "+sum);
    }
}
