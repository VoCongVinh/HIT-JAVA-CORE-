import java.util.Scanner;
public class vinh1 {
    public static void thtt(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tong la: " + (a + b));
        System.out.println("Hieu la: " + (a - b));
        System.out.println("Tich la: " + (a * b));
        System.out.println("Thuong la: " + (a / b));
    }
    public static int tong( int a,int b){
    Scanner sc = new Scanner(System.in);

    return  a + b;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        thtt(a, b);
        System.out.println("Tong tu ham tong: " + tong(a, b));
    }
}
