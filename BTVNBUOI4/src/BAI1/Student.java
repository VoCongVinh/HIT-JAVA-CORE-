package BAI1;
public class Student {
    String name;
    int born;
    String adr;
    double tx1,tx2;
    double kthp;
    int stnghi;
    public Student(String name,int born,String adr,double tx1,double tx2,double kthp,int stnghi){
        this.name = name;
        this.born = born;
        this.adr = adr;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.stnghi = stnghi;
    }
    public int age(){
        return 2025 - born;
    }
    public double gpa(){
        return tx1 * 0.2 + tx2 * 0.3+ kthp * 0.5;
    }
    public void List() {
        System.out.printf("%-20s %-5d %-15s %-5.1f %-5.1f %-5.1f %-5.2f %-3d\n", name, age(), adr, tx1, tx2, kthp, gpa(), stnghi);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBorn() {
        return born;
    }
    public void setBorn(int born) {
        this.born = born;
    }
    public String getAddress() {
        return adr;
    }
    public void setAddress(String address) {
        this.adr = adr;
    }
    public double getTx1() {
        return tx1;
    }
    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }
    public double getTx2() {
        return tx2;
    }
    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }
    public double getKthp() {
        return kthp;
    }
    public void setKthp(double kthp) {
        this.kthp = kthp;
    }
    public int getRest() {
        return stnghi;
    }
    public void setRest(int rest) {
        this.stnghi = stnghi;
    }
    public Student(){}
}
