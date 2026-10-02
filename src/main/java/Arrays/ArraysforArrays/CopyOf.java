package Arrays.ArraysforArrays;

import java.util.Arrays;
// Creating copy of an existing array
public class CopyOf {
    public static void main(String[] args) {
        int intarr[]={10,20,30,40,50};
        System.out.println("Integer Array"+ Arrays.toString(intarr));
        // copyOf(existed array, new length);
        System.out.println("copy of array with 10 size but existing array size is 5:"+Arrays.toString(Arrays.copyOf(intarr,10))); // creating the copy

        // copyOfRange(existing array, starting, ending);
        System.out.println("copyofrange(1,4):"+Arrays.toString(Arrays.copyOfRange(intarr, 1,4)));
    }
}
