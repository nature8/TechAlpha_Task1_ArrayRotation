import java.util.Arrays;

public class ArrayRotation {
    public static void main(String...ar) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of elements to rotate
        
        System.out.println("Original array: " + Arrays.toString(arr));
        int n = arr.length;
        // Reverse the first 'd' elements
        for (int i = 0, j = d - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // Reverse the remaining 'n-d' elements
        for (int i = d, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // Reverse the entire array
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
