package Arrays.ArraysforArrays;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int index= Arrays.binarySearch(arr,4);
        System.out.println(index);

        int arr2[]={30,50,34,56,23,12};
        int index2=Arrays.binarySearch(arr2,50);// here this is not search why because the binary serach need the sorted array
        System.out.println(index2);
        // so we need to sort first
        Arrays.sort(arr2);
        int index3=Arrays.binarySearch(arr2,50);
        System.out.println(index3);

        // Traversing the submitted arrays
        for(int x:arr2)
        {
            System.out.println(x);
        }

    }
}
