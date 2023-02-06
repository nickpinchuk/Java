package hw15;
import java.util.Random;
public class ShakerSort {
        public static void main(String[] args) {
            int temp;
            int arraySize = 10;
            int[] array = new int[arraySize];
            Random newRandom = new Random();


            for (int i = 0; i < array.length; i++) {
                array[i] = newRandom.nextInt(10) + 1;
                System.out.print(array[i] + " ");
            }
            System.out.println();

            int leftSide = 0;
            int rightSide = array.length - 1;

            do {

                for (int i = leftSide; i < rightSide; i++) {


                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
                rightSide--;
                for (int i = rightSide; i > leftSide; i--) {
                    if (array[i] < array[i - 1]) {
                        temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                    }
                }
                leftSide++;

            } while (leftSide < rightSide);
            for (int i : array
            ) {
                System.out.print(array[i] + " ");
            }
        }
    }

