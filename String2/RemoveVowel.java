public class RemoveVowel {
    public static void main(String[] args) {
        String s = "Hello , have good day";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                continue;
            }
            str += s.charAt(i);

        }
        System.out.println(str);
    }
}
