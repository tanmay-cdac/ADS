package Assignment3;

public class Problem05 {

    // Quick Sort method
    static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pIndex = partition(a, start, end); // partition index
            quickSort(a, start, pIndex - 1);       // left part
            quickSort(a, pIndex + 1, end);         // right part
        }
    }

    // Partition method
    static int partition(int[] a, int start, int end) {
        int pivot = a[end]; // pivot = last element
        int i = start - 1;  // place for swapping

        for (int j = start; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                // swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;

        return i + 1;
    }

    // Print array
    static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] a = {88, 11, 33, 22, 66, 111, 55, 77, 44, 99};

        System.out.println("Array before sorting:");
        printArray(a);

        quickSort(a, 0, a.length - 1);

        System.out.println("Array after sorting:");
        printArray(a);
    }
}
