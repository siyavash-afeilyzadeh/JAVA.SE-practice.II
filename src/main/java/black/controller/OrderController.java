package black.controller;

import black.bl.OrderBL;
import black.model.Order;

public class OrderController {
    public String save(int id, String name, float price, int quantity) {
        try {
            Order order = Order
                    .builder()
                    .id(id)
                    .name(name)
                    .price(price)
                    .quantity(quantity)
                    .build();
            OrderBL orderBL = new OrderBL();
            orderBL.save(order);
            return "Order has been saved successfully";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }

    public String update(int id, String name, float price, int quantity) {
        try {
            Order order = Order
                    .builder()
                    .id(id)
                    .name(name)
                    .price(price)
                    .quantity(quantity)
                    .build();
            OrderBL orderBL = new OrderBL();
            orderBL.update(order);
            return "Order has been updated successfully";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }

    public String delete(int id) {
        try {
            OrderBL orderBL = new OrderBL();
            orderBL.delete(id);
            return "Successfully Deleted";
        } catch (Exception e) {
            return "ERROR " + e.getMessage();

        }

    }
}
