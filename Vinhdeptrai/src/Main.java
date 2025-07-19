import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Tong la: " + (a + b));
        System.out.println("Hieu la: " + (a - b));
        System.out.println("Tich la: " + (a * b));
        System.out.println("Thuong la: " + (a / b));
        if(a > b){
            System.out.println("a lon hon b ");
        }
        if(a < b){
            System.out.println("b lon hon a");
        }
        if(a == b){
            System.out.println("a bang b");
        }
    }
    }