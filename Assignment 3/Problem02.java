package Assignment3;

public class Problem02 {
    static void Insertion_Sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int j = i + 1;
            int new_element = a[j];
            while (j > 0 && a[j - 1] > new_element) {
                a[j] = a[j - 1];//come back
                j--;
            }
            a[j] = new_element;
        }
    }
    static void print_array(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        {
            int[] a ={88,11,33,22,66,111,55,77,44,99};
            System.out.println("Array before sorting");
            print_array(a);
            Insertion_Sort(a);
            System.out.println("\nArray after sorting");
            print_array(a);

        }
    }
}
