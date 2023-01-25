import java.util.ArrayList;
import java.util.Random;

public class Sample01 {
    public static void main(String[] args) {
        int[] testArray = ArrayUtils.createArray();
        ArrayUtils.printArray(testArray);
        quickSort(testArray, 0, testArray.length - 1);
        ArrayUtils.printArray(testArray);
    }

    public static void quickSort(int[] array, int startPosition, int endPosition){
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2]; // значение опорного элемента

        do{
            while (array[leftPosition] < pivot){
                leftPosition++;
            }
            while (array[rightPosition] > pivot){
                rightPosition--;
            }
            if (leftPosition <= rightPosition){
                if (leftPosition < rightPosition){
                    int buf = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = buf;
                }
                leftPosition++;
                rightPosition--;
            }
        }
        while (leftPosition <= rightPosition);

        if (leftPosition < endPosition){
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition){
            quickSort(array, startPosition, rightPosition);
        }
    }

    static class ArrayUtils{

        private static Random random = new Random();

        static int[] createArray(){
            int[] array = new int[random.nextInt(10) + 5]; // Массив размером от 5 до 15
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
            return array;
        }

        static int[] createGreatestArray(int length){
            int[] array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
            return array;
        }

        static void printArray(int[] array){
            for (int item : array) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

    }
}
