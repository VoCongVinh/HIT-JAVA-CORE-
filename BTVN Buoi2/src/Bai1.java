import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String a = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int b = sc.nextInt();
        System.out.println("Nhap chieu cao: ");
        float c = sc.nextFloat();
        System.out.println("Xin chao " + a);
        System.out.print("Ban cao" + b + " met va cao " + c + " met");
    }
}