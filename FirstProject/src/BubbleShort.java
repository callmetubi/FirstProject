import java.util.Arrays;
public class BubbleShort {

    public static void main(String[] args) {

        int[] array={10,9,8,7,6,5,4,3,2,1};

        int counter = 0;
        boolean swapped;
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));




        for(int i = 1; i < array.length ; i++) {
            swapped= false;
            counter++;
            for(int j = 0; j < array.length - i; j++) {
                counter++;
                if(array[j] > array[j + 1]) {
                    counter++;
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greater;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
        }

    }

