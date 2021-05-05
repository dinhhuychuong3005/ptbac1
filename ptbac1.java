import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a:");
        a = sc.nextDouble();
        System.out.println("b:");
        b = sc.nextDouble();
        System.out.println("c:");
        c = sc.nextDouble();
        if (a != 0){
            double answer = (c-b)/a;
            System.out.println("ket qua phuong trinh bac 1 la " + answer);
        }else {
            if (b == 0){
                System.out.println("phuong trinh vo so nghiem");
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
