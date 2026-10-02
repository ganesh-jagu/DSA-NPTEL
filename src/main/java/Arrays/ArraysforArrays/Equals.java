package Arrays.ArraysforArrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.equals(arr1,arr2));

        int arr3[]={1,2,3,4,7,89,23};
        int arr4[]={1,2,3,4,5,23,89};
        System.out.println(Arrays.equals(arr3,arr4));

    }
}
