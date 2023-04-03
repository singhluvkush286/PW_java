public class CheckE {
    public static void main(String[] args) {
        String s = "Umbrella";
        for(int i=0; i<s.length();i++)
            if(s.charAt(i)=='e') {
                System.out.println("E is present in string");
                break;
            }
    }
}
