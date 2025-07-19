import java.util.Scanner;

class Sinhvien{
    String ten;
    int tuoi;
    double diem;

    public Sinhvien(String ten,int tuoi,double diem){
        this.ten=ten;
        this.tuoi=tuoi;
        this.diem = diem;
    }
    public void Thongtin(){
        System.out.println("tên: "+ ten+" , tuổi: "+ tuoi+", điểm: "+diem);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số lượng nhân viên: ");
        int n=sc.nextInt();
        sc.nextLine();
        Sinhvien[] danhsach=new Sinhvien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông ton sinh viên thứ "+(i+1));
            System.out.print("tên: " );
            String ten=sc.nextLine();

            System.out.print("tuổi: ");
            int tuoi=sc.nextInt();

            System.out.print("điểm: ");
            double diem=sc.nextDouble();
            sc.nextLine();
            danhsach[i] = new Sinhvien(ten,tuoi,diem);
        }
        System.out.println("Danh sách sinh viên: ");
        for(Sinhvien sv:danhsach){
            sv.Thongtin();
        }
        double tongdiem=0;
        for(int i=0;i<n;i++){
            tongdiem +=danhsach[i].diem;
        }
        double diemtb=tongdiem/n;
        System.out.println("điểm tb của cả lớp= "+ diemtb);

        Sinhvien svmax=danhsach[0];
        for(int i=1;i<n;i++){
            if(danhsach[i].diem > svmax.diem){
                svmax=danhsach[i];
            }
        }
        System.out.println("sinh viên có điểm cao nhất : ");
        svmax.Thongtin();
    }
}
