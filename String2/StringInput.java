import java.io.*;
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter thr String which you want to enter : ");
        String s = in.nextLine();
        System.out.println(s);
    }
}
