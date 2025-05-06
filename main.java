public class main {
    public static void main(String[] args) {
        double soTien = 1000000; // 1 triệu VNĐ

        IThanhToan thanhToan1 = new ThanhToanTienMat();
        IThanhToan thanhToan2 = new ThanhToanTheTinDung();

        System.out.println("=== Mô phỏng Thanh Toán ===");
        thanhToan1.thanhToan(soTien);
        thanhToan2.thanhToan(soTien);
    }
}
