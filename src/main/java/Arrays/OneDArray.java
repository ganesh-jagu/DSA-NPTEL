package Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[2]);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        String str[]=new String[5];
        System.out.println("String Array Length:"+str.length);
        str[1]="String-1";
        str[2]="String-2";
        System.out.println(str[2]);
//        str[11]="String-11";
//        System.out.println(str[11]);
        for (int j=0;j< str.length;j++)
        {
            String name="String"+j;
            str[j]=name;
        }
        for(int k=0;k<str.length;k++)
        {
            System.out.println(str[k]);
        }

    }
}
