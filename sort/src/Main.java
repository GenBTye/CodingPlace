import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElemIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElemIndex] > arr[j]) {
                    minElemIndex = j;
                }
            }
            if (minElemIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElemIndex];
                arr[minElemIndex] = temp;
            }

        }
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int element = rand.nextInt(n);
            arr[i] = element;
        }
        /*Arrays.sort(arr);*/
        selectionSort(arr);
    }
}