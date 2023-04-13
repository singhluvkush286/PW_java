import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String str = "PWSKILLS";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String str1="";
        for(char c: ch)
        {
            str1+=c;
        }
        System.out.println(str1);
    }
}
