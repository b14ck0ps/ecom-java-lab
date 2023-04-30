package ecom.dto;

import ecom.domain.Customer;
import ecom.domain.Product;

import java.util.List;

public class OrderDto {

    private List<Product> product;
    private Customer customer;
    private List<Customer> customers;

    public OrderDto() {
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
