import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong 5: ");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("5 x " + i + " = " +( 5 * i));
        }
        int t = 0;
        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                t += i;
            }
            i++;
        }
        System.out.print("Tong cac so chan tu 1 den 100 la: " + t);
        sc.close();
    }

}
