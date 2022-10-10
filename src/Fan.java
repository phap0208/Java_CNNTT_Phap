public class Fan {
    String thuongHieu;
    String loai;
    float gia;
    int congSuat;
    int capDo;
    boolean quayNgang;

    public Fan(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }

    void chuyenSo(int so){
        if(so>=0)
            this.capDo = so;
        else
            System.out.println("So khong hop le");
    }
    void chuyenTrangThaiQuay(){
        this.quayNgang = !this.quayNgang;
    }

    void bat(){
        if(this.capDo==0){
            chuyenSo(1);
        }
    }
    void tat(){
        chuyenSo(0);
    }

    @Override
    public String toString() {
        return "Fan{" +
                "thuongHieu='" + thuongHieu + '\'' +
                ", loai='" + loai + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", capDo=" + capDo +
                ", quayNgang=" + quayNgang +
                '}';
    }
    void hienThi(){
        System.out.println(this);
    }
    public static void main(String[] args) {

        Fan LG1 = new Fan("VIETNAM", "LG", 20000, 1000);
        Fan chinghai2 = new Fan("TRUNGQUOC", "ching hai", 30000, 2000);
        LG1.hienThi();
        chinghai2.hienThi();
        LG1.bat();
        chinghai2.tat();
        LG1.chuyenSo(2);
        chinghai2.chuyenSo(3);
        LG1.chuyenTrangThaiQuay();
        LG1.hienThi();
    }
}
