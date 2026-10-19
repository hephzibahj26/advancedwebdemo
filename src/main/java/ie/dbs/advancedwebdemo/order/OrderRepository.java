package ie.dbs.advancedwebdemo.order;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> findAll() {
        return orders;
    }

    public void save(Order order) {
        orders.add(order);
    }
}
