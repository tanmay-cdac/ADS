package Assignment2;
public class Problem02 {
    public static void main(String[] args) {
        int[] arr = {15, 8, 22, 5, 19};
        int min = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
