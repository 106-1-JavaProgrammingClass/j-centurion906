import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(Math.round(a+b));
        System.out.println(Math.round(a*b));
    }
}