package coffee.order;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
            orderBoard.addOrder(new Order("Alen"));
            orderBoard.addOrder(new Order("Yoda"));
            orderBoard.addOrder(new Order("Obi-van"));
            orderBoard.addOrder(new Order("John Snow"));

            orderBoard.draw();

            orderBoard.deliver();
            orderBoard.deliverById(2);

            orderBoard.draw();
        }catch (Exception e){
            LOGGER.error("An error occurred: ", e);
        }
    }
}
