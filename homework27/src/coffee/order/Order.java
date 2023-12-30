package coffee.order;

public class Order {
    private static int nexOrderId = 1;
    private final int orderId;
    private final String name;

    public Order(String name) {
        this.orderId = nexOrderId++;
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }


    public String getName() {
        return name;
    }


}
