package Assignment2;

public class Problem08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        System.out.println("Destination array: ");
        for(int a : arr1){
            System.out.print(a+" ");
        }
    }
}