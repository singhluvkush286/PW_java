import java.io.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to check the palindrome :");
        String str = in.nextLine();
        int j=str.length()-1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                break;
            }
            j--;

        }
        if(j==-1)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

    }
}
