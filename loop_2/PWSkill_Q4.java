public class PWSkill_Q4 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j == 0 || i == 0 || i == (n - 1) / 2  || (j == (n - 1) && i < (n - 1) / 2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
               System.out.print("  ");

            }
            for(int j=0;j<23;j++)
            {
                if(i==j ||( i+j==18 && i>4 )|| (j-i==6 && i>4) || (i+j==22 && j>14) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("     ");
            for (int j = 0; j < n; j++)
            {
                if ((j == 0 && i<(n-1)/2)|| i == 0|| i == (n - 1) || i ==(n - 1) / 2 || (j == n-1 && i>(n-1)/2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j < n; j++)
            {
                if (j==0|| (i+j==5 && j<(n-1))    || (i-j==4 && i>=(n+1)/2) )
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }
            for (int j = 0; j < n; j++)
            {
                if (j == (n-2)/2 || (i == 0 && j<n-2)|| (i == n - 1 && j<n-2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }
            for (int j = 0; j < n; j++)
            {
                if (j == 0 || (i == n-1 && j<n-2))

            {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }
            for (int j = 0; j < n; j++)
            {
                if (j == 0 || (i == n-1 && j<n-2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }
            for (int j = 0; j < n; j++)
            {
                if ((j == 0 && i<(n-1)/2)|| i == 0|| i == (n - 1) || i ==(n - 1) / 2 || (j == n-1 && i>(n-1)/2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");

            }

            System.out.println();
        }
    }
}
