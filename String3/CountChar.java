import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to count the vowel , consonent , & special character :");
        String str = in.nextLine();
        int vowel=0,consonent=0,special=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            } else if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
            {
                vowel++;
            } else if (str.charAt(i)>97 && str.charAt(i)<123) {
                consonent++;
            }
            else{
                special++;
            }
        }
        System.out.println("Number of vowel :  "+vowel);
        System.out.println("Number of consonent :  "+consonent);
        System.out.println("Number of special :  "+special);

    }
}
