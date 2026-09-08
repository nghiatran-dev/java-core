package Chapter9.Video90;

import Chapter9.Video89.Level;

public enum OrderStatus {
    PENDING("Chờ xác nhận"),
    IN_TRANSIT("Đang giao hàng"),
    DELIVERED("Đã giao hàng"),
    CANCELLED("Đã hủy");

    private final String description;

    private OrderStatus(String _description) {
        this.description = _description;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean hasFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
}
