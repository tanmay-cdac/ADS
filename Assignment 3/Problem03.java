package Assignment3;

public class Problem03 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {88, 11, 33, 22, 66, 111, 55, 77, 44, 99};

        System.out.println("Array before sorting:");
        printArray(a);

        selectionSort(a);

        System.out.println("\nArray after sorting:");
        printArray(a);
    }
}
