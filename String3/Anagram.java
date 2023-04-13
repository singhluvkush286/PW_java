import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = in.nextLine();
        System.out.println("Enter the second string");
        String str2 = in.nextLine();
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int counter = 0;
        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    System.out.println("Not a Anagram ");
                    break;
                }
                counter++;
            }

        }
        else
        {
            System.out.println("Not a Anagram Number");
        }
        if(counter==str1.length())
        {
            System.out.println("Anagram number");
        }
    }
}

