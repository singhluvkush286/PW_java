public class Q5_Name {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
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
                if (j == 0 || i == n-1  || j==n-1)
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
                if (i==j)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }

            }


            for (int j = 0; j < n; j++)
            {
                if (i+j==8)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }


            }
            System.out.print("    ");

            for (int j = 0; j < n; j++)
            {
                if (j==0|| (i+j==5 && j<(n-1)) || (i-j==4 && i>=(n+1)/2) )
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
                if (j == 0 || i == n-1  || j==n-1)
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
                if ((j == 0 && i<(n-1)/2)|| i == 0|| i == (n - 1) || i ==(n - 1) / 2 || (j == n-1 && i>(n-1)/2))
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
                if(j==n-1|| j==0 || i==(n-1)/2 )
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
