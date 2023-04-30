package ecom.service;

import ecom.domain.Customer;
import ecom.domain.Product;
import ecom.dto.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ProductService productService;

    private final CustomerService customerService;

    public OrderService(ProductService productService, CustomerService customerService) {
        this.productService = productService;
        this.customerService = customerService;
    }

    public void createOrder(OrderDto orderDto) {
        Long productId = orderDto.getProductId();
        Long customerId = orderDto.getCustomerId();

        Product product = productService.get(productId);
        Customer customer = customerService.get(customerId);

        product.getCustomers().add(customer);

        productService.create(product);
    }
}
