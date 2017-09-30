import java.util.Scanner;

public class HW1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int kl = scn.nextInt();
        System.out.println(Math.round(kl*0.26418*10)/10f);
    }
}