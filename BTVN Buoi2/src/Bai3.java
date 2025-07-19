import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("Tong la: " + (a + b));
        System.out.println("Hieu la: " + (a - b));
        System.out.println("Tich la: " + (a * b));
        System.out.println("Thuong la: " + (a / b));
        System.out.println("So du la: " + ( a % b));
        if(a == b){
            System.out.println("Bang nhau.");
        }
        if(a > b){
            System.out.println("a lon hon b.");
        }
        if(a < b){
            System.out.println("a be hon b.");
        }

    }
}
