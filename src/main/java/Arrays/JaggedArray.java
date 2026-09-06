package Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
         arr[0]=new int[1];
         arr[1]=new int[4];
         arr[2]=new int[2];

         arr[0][0]=1;
         arr[1][0]=10;
         arr[1][1]=11;
         arr[1][2]=12;
         arr[1][3]=13;
        // arr[1][4]=14;
        arr[2][0]=21;
        arr[2][1]=22;

        System.out.println(arr[1][2]);

        for (int i = 0; i < arr.length; i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Method-2 for declaration
        int ar[][]={
                {1,2,3,4},
                {10,11},
                {21,22,23,24,25},
                {31,32,33}
        };
        System.out.println(ar[2][2]);
        for (int i = 0; i < ar.length; i++)
        {
            for (int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}

