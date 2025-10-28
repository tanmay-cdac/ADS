package Assignment2;
public class Problem04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double sum = 0;
        int total_num = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/total_num);
    }
}
