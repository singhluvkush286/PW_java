import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class CheckUnique{
    public static boolean unique(String str1)
    {
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
        for(int i=0;i<ch.length;i++) {
            if (ch[i] != 0 && ch[i] != 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = in.nextLine();
        if(unique(str1))
        {
            System.out.println("Unique ");
        }
        else
        {
            System.out.println("Not Unique");
        }


    }
}
