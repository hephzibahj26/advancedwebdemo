package ie.dbs.advancedwebdemo.order;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    public double calculateTotal(Order order) {
        return order.getPrice() * order.getQuantity();
    }
}
