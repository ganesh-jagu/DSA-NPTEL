package Arrays.ArraysforArrays;

import java.util.Arrays;

// Sorting method 'sort()'
public class Sorting {
    public static void main(String[] args) {
        int arr[]={1,8,5,80,98,56,78};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array");
        Arrays.sort(arr); // It does not return or print anything juts sort the existed array only
        System.out.println(Arrays.toString(arr));
        int arr2[]={5,2,3,6,7,1,45,89,34,22};
        Arrays.sort(arr2,2,7);
        System.out.println(Arrays.toString(arr2));

        int arr3[]={7,78,4,900,5,6,6,7,7,45,67,4,3,3,22,3,4,4,90,5,5,5,3,89,2,30,2,2,2,2,3,3,3,6,4,5,6,86,6,6,3,2,2,2,2};
        Arrays.parallelSort(arr3); // it will sort the elements very fastl when there is a large set of data
        System.out.println(Arrays.toString(arr3));
    }
}
