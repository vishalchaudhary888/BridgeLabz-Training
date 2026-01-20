import java.util.Arrays;
import java.util.Random;

public class SortingAnalysis {

    // -------- Bubble Sort O(N^2) --------
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // -------- Merge Sort O(N log N) --------
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // -------- Quick Sort O(N log N) --------
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // -------- Main Method --------
    public static void main(String[] args) {

        int size = 10_000; // change size to test
        int[] original = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            original[i] = rand.nextInt(100000);
        }

        int[] arr1 = Arrays.copyOf(original, size);
        int[] arr2 = Arrays.copyOf(original, size);
        int[] arr3 = Arrays.copyOf(original, size);

        // Bubble Sort timing
        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) + " ns");

        // Merge Sort timing
        start = System.nanoTime();
        mergeSort(arr2, 0, arr2.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) + " ns");

        // Quick Sort timing
        start = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) + " ns");
    }
}
