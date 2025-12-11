import java.util.*;

class MatrixMultiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;
        System.out.println("Number of row and column should be same :");
        System.out.println("Enter rows of Matrix A:");
        r1 = sc.nextInt();

        System.out.println("Enter columns of Matrix A:");
        c1 = sc.nextInt();

        System.out.println("Enter rows of Matrix B:");
        r2 = sc.nextInt();

        System.out.println("Enter columns of Matrix B:");
        c2 = sc.nextInt();

        if(c1 != r2)
        {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];

        System.out.println("Enter elements of Matrix A:");
        int i = 0;
        while(i < r1)
        {
            int j = 0;
            while(j < c1)
            {
                a[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("Enter elements of Matrix B:");
        i = 0;
        while(i < r2)
        {
            int j = 0;
            while(j < c2)
            {
                b[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        i = 0;
        while(i < r1)
        {
            int j = 0;
            while(j < c2)
            {
                int k = 0;
                c[i][j] = 0;

                while(k < c1)
                {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                    k++;
                }
                j++;
            }
            i++;
        }

        System.out.println("Multiplication of Arrays :");
        i = 0;
        while(i < r1)
        {
            int j = 0;
            while(j < c2)
            {
                System.out.print(c[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
