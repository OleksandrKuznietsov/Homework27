package coffee.order;

import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

    private final Queue<Order> orderQueue = new LinkedList<>();
    private final Logger logger = Logger.getLogger(CoffeeOrderBoard.class);


    public void addOrder(Order order) {
        orderQueue.add(order);
        logger.info("Added order №" + order.getOrderId() + " for customer: " + order.getName());
    }

    public void deliver() {
        if (!orderQueue.isEmpty()) {
            Order nextOrder = orderQueue.poll();
            logger.info("Delivered order №" + nextOrder.getOrderId() + " for customer: " + nextOrder.getName());
        } else {
            logger.info("No orders to deliver.");
        }

    }

    public void deliverById(int id) {
        Order requestedOrder = null;
        for (Order order : orderQueue) {
            if (order.getOrderId() == id) {
                requestedOrder = order;
                break;
            }
        }

        if (requestedOrder != null) {
            orderQueue.remove(requestedOrder);
            logger.info("Delivered order №" + requestedOrder.getOrderId() + " for customer: " + requestedOrder.getName());
        } else {
            logger.info("Order № " + id + " not found.");
        }
    }

    public void draw() {
        logger.info("Num | Name");
        for (Order order : orderQueue) {
            logger.info(order.getOrderId() + " | " + order.getName());
        }
    }
}
