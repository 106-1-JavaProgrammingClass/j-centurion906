import java.util.Scanner;

public class  HW7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();
        System.out.println(Math.round(cm)/2.54);
        System.out.println(Math.round(kg)/0.454);
    }
}