package ecom.service;

import ecom.domain.Customer;
import ecom.domain.Product;
import ecom.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final ProductService productService;

    private final CustomerService customerService;

    public OrderService(ProductService productService, CustomerService customerService) {
        this.productService = productService;
        this.customerService = customerService;
    }

    public void createOrder(OrderDto orderDto) {

        Customer customer = orderDto.getCustomer();
        List<Product> products = orderDto.getProduct();
        customer.setProducts(products);
        customerService.create(customer);

    }
}
