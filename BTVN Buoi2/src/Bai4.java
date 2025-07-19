import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap phan tu cua mang: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int t = 0;
        for(int i = 0 ; i < n ; i++){
            t += a[i];
            System.out.println(a[i] + " ");
        }
        System.out.println("Tong cua mang la: " +  t);
        int max = a[0];
        for(int i = 0 ; i < n ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
    }
}
