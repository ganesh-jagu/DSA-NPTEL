package Arrays.ArraysforArrays;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println("Normal To String:"+Arrays.toString(arr));

        System.out.println("DeepToString:"+Arrays.deepToString(arr));

        int arr2[][]=Arrays.copyOf(arr,10);
        System.out.println(Arrays.deepToString(arr2));

        System.out.println(Arrays.deepEquals(arr,arr2));
    }
}
