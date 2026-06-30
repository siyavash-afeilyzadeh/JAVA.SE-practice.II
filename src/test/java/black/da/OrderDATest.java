package black.da;

import black.model.Order;

import java.sql.SQLException;

public class OrderDATest {
    public static void main(String[] args) throws SQLException {
//        Order order = Order
//                .builder()
//                .id(1)
//                .name("Laptop")
//                .price(1000.00F)
//                .quantity(1)
//                .build();
//        System.out.println(order);

        OrderDA orderDA = new OrderDA();
//        orderDA.save(order);
//        orderDA.update(order);
        orderDA.delete(1);
    }
}
