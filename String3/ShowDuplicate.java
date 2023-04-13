import java.util.Scanner;

public class ShowDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to remove the duplicate :");
        String s = in.nextLine();
        String newString ="";
        newString+=s.charAt(0);
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            c=0;
            for(int j=0;j<newString.length();j++)
            {
                if(s.charAt(i)==newString.charAt(j)) {
                    c++;
                }
            }
            if(c==1)
            {
                newString=newString + s.charAt(i);
            }
        }

        System.out.println(" Duplicate Element in string :");
        System.out.println(newString);


    }
}
