package Assignment2;
public class Problem07 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int search = 30;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                System.out.println("Element found at index "+i);
                break;
            }
        }
    }
}
