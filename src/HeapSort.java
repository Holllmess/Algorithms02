public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 33, 54, 2, 4, 1, 23, -7, 89, -1};
        heapSort(array);

        System.out.println("Heapsort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int buf = array[i];
            array[i] = array[0];
            array[0] = buf;

            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < n && array[left] > array[largest]){
            largest = left;
        }
        if (right < n && array[right] > array[largest]){
            largest = right;
        }

        if (i != largest){
            int buf = array[i];
            array[i] = array[largest];
            array[largest] = buf;

            heapify(array, largest, n);
        }
    }
}
