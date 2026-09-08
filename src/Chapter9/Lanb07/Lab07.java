package Chapter9.Lanb07;

public class Lab07 {
    public static void main(String[] args) {
        System.out.println("=== Lab 07 ===");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Order order = new Order("A001", OrderStatus.PENDING);
                // Print log
                order.processOrder();

                // Print customer info
                Order.CustomerInfo customerInfo = order.new CustomerInfo("Victor", "076*****93");
                customerInfo.printCustomerInfo();

                // Print order status
                System.out.printf("Trạng thái đơn hàng: %s(%s)\n", order.getStatus().getDescription(), order.getStatus());

                // Print discount info
                Order.DiscountHelper discountHelper = new Order.DiscountHelper();
                String discount = discountHelper.calDiscount(order.getStatus());
                System.out.printf("Chiết khấu áp dụng: %s\n", discount);

                System.out.printf("Đơn hàng [%s] đang được xử lý ở trạng thái %s(%s)\n", order.getOrderId(), order.getStatus().getDescription(), order.getStatus());
            }
        };

        task.run();
    }
}
