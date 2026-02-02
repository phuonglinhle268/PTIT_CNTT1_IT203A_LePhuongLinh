package PTIT_CNTT1_IT203A_Session08;

public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    private double diemTB;
    private String xepLoai;

    public Student(String maSV, String hoTen, int tuoi, String gioiTinh,
                   double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

        tinhDiemTB();
        xepLoai();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void tinhDiemTB() {
        diemTB = (diemToan + diemLy + diemHoa) / 3;
    }

    public void xepLoai() {
        if (diemTB >= 8 && diemToan >= 6.5 && diemLy >= 6.5 && diemHoa >= 6.5)
            xepLoai = "Giỏi";
        else if (diemTB >= 6.5 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5)
            xepLoai = "Khá";
        else if (diemTB >= 5 && diemToan >= 3.5 && diemLy >= 3.5 && diemHoa >= 3.5)
            xepLoai = "Trung bình";
        else
            xepLoai = "Yếu";
    }

    public void studentInfo() {
        System.out.printf("%-10s %-17s %-7s %-10s %-15.2f %-15s\n",
                maSV, hoTen, tuoi, gioiTinh, diemTB, xepLoai);
    }
}
