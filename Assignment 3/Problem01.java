package Assignment3;

public class Problem01 {
    static void Bubble_Sort(int[] a) {
        int temp;
        for(int i=0;i<a.length-1;i++)  //  n=5   length=5   length-1--> 4  0,1,2,3 passes
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
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
            Bubble_Sort(a);
            System.out.println("\nArray after sorting");
            print_array(a);

        }
    }
}
