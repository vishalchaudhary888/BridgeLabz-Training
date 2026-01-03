class Order {
    int orderId;
    int orderDate;

    Order(int orderId, int orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    long trackingNumber;

    ShippedOrder(int orderId, int orderDate, long trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " → Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    int deliveryDate;

    DeliveredOrder(int orderId, int orderDate, long trackingNumber, int deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " → Order Delivered";
    }
}

public class OnlineRetailManagement {
    public static void main(String[] args) {

        Order ram = new DeliveredOrder(522, 2, 5564475L, 3);
        System.out.println(ram.getOrderStatus());
    }
}
