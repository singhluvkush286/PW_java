import java.util.Scanner;

public class CountMaxOccurance {
    public static char getMaxOccurringChar(String str1) {
        str1=str1.replace(" ","");
        str1=str1.toLowerCase();
        int[] ch=new int[26];
        for(int i=0;i< str1.length();i++)
        {
            if(str1.charAt(i)>=97 && str1.charAt(i)<=123)
            {
                int a=str1.charAt(i)-97;
                ch[a]++;
            }
        }
        int max=0;
        int index=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>max)
            {
                max=ch[i];
                index=i;
            }

        }
        int uni = index+97;
        return (char)uni;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to count max occurance ");
        String S = input.nextLine();
        char c = getMaxOccurringChar(S);
        System.out.println("Character with maximum occurance is  "+c);

    }
}
