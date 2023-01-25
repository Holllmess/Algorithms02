public class LectureSample00 {
    public static void main(String[] args) {

        //TODO: Binary Search Algorithm
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 2));
    }

    //TODO: Binary Sort Algorithm
    // перегрузка метода для упрощения вызова
    public static int binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int value, int min, int max){

        int midpoint;
        if (max < min){
            return -1; // error code
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value){ // то есть берем правую сторону
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value){ // то есть берем левую сторону
                return binarySearch(array, value, min, midpoint - 1);
            } else { // то есть midpoint равен value
                return midpoint;
            }
        }
    }
}
