import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(Math.round(a+b+c));
        System.out.println(Math.round(a+b+c)/3);
    }
}