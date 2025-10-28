package Assignment2;

public class Problem01 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 3, 19};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
