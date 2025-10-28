package Assignment2;
public class Problem09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
        if(counter==0){
            System.out.println("No duplicates found");
        }
    }
}