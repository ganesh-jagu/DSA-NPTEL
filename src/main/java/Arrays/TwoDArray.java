package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;

        System.out.println(a[2][0]);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++) {
            int singlerow[] = a[i];
             for (int j = 0; j< singlerow.length; j++) {
                System.out.print(singlerow[j]+"  ");
            }
            System.out.println();
        }

        String[][] str={
                {"Name-1","Name-2"},
                {"Name-3","Name-4"},
                {"Name-5","Name-6"}
        };
        System.out.println("String Length:"+str.length);
        for (int i = 0; i < str.length; i++)
        {
            for(int j=0;j<str[i].length;j++)
            {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }
    }
}
