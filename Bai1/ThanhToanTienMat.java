public class ThanhToanTienMat implements IThanhToan {
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " VNĐ bằng tiền mặt.");
    }
}
