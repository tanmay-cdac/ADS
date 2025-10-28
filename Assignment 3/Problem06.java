package Assignment3;

public class Problem06 {
    static void sort(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void print(String[] arr){
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};
        String[] arr1 = {"dog", "beep", "elephant", "bee"};

        sort(arr);
        sort(arr1);
        System.out.println("Sort of Array 1:");
        print(arr);
        System.out.println("\nSort of Array 2:");
        print(arr1);
    }
}
