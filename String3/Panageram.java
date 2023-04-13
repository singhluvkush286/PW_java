import java.util.Scanner;

public class Panageram {

    public static boolean panagram(String str1)
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
        for(int i : ch)
        {
            if(i==0)
            {
                //System.out.println("Not a panagram Number ");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = in.nextLine();
        if(panagram(str1))
        {
            System.out.println("Panagram Number");
        }
        else
        {
            System.out.println("Not a panagram number ");
        }


    }
}
