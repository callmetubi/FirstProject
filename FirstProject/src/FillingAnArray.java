public class FillingAnArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }

        System.out.println("Array values:");
        for (int n: numbers) {
            System.out.println(n);
        }


    }
}
