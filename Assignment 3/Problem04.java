package Assignment3;

public class Problem04 {

    // Merge two sorted subarrays: a[start..mid] and a[mid+1..end]
    static void merge(int[] a, int start, int mid, int end) {
        int i = start, j = mid + 1, ti = start;
        int[] temp = new int[a.length];

        // Compare and copy into temp[]
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[ti++] = a[i++];
            } else {
                temp[ti++] = a[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[ti++] = a[i++];
        }

        // Copy remaining elements from right subarray
        while (j <= end) {
            temp[ti++] = a[j++];
        }

        // Copy merged elements back to original array
        for (i = start; i <= end; i++) {
            a[i] = temp[i];
        }
    }

    // Recursive merge sort
    static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Divide
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);

            // Conquer (merge sorted halves)
            merge(a, start, mid, end);
        }
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

        mergeSort(a, 0, a.length - 1);

        System.out.println("Array after sorting:");
        printArray(a);
    }
}
