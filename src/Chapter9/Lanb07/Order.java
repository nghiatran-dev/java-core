package Chapter9.Lanb07;

public class Order {
    private String orderId;
    private OrderStatus status;

    public Order(String _id, OrderStatus _status) {
        this.orderId = _id;
        this.status = _status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void processOrder() {
        class Logger {
            public void orderInfo() {
                System.out.printf("[LOG] Xử lý đơn hàng ID: %s - Trạng thái: %s(%s)\n", orderId, status.getDescription(), status);
            }
        }

        Logger log = new Logger();
        log.orderInfo();
    }

    class CustomerInfo {
        private String name;
        private String phoneNumber;

        public CustomerInfo(String _name, String _phoneNumber) {
            this.name = _name;
            this.phoneNumber = _phoneNumber;
        }

        public void printCustomerInfo() {
            System.out.printf("Khách hàng: %s - %s\n", this.name, this.phoneNumber);
        }
    }

    static class DiscountHelper {
        public String calDiscount(OrderStatus _status) {
            return switch (_status) {
                case IN_TRANSIT -> "10%";
                case DELIVERED, CANCELLED -> "0%";
                default -> "5%";
            };
        }
    }
}
