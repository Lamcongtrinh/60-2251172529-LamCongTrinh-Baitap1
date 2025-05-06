public class ThanhToanTheTinDung implements IThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " VNĐ bằng thẻ tín dụng.");
    }
}
