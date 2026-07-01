package black.bl;

import black.da.OrderDA;
import black.model.Order;

import java.sql.SQLException;

public class OrderBL {
    public void save(Order order) throws SQLException {
        OrderDA orderDA = new OrderDA();
        if (order.getQuantity() < 6) {
            orderDA.save(order);
            System.out.println("Order has been saved successfully");
        } else {
            System.out.println("Quantity must be 5 or less");
        }
    }

    public void update(Order order) throws SQLException {
        OrderDA orderDA = new OrderDA();
        orderDA.update(order);
    }

    public void delete(int id) throws SQLException {
        OrderDA orderDA = new OrderDA();
        orderDA.delete(id);

    }
}
