package Arrays.ArraysforArrays;

import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,10)));
        Arrays.fill(arr,89);
        System.out.println(Arrays.toString(arr));

    }
}
