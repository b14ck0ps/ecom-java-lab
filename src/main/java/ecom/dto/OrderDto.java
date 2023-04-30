package ecom.dto;

public class OrderDto {
    private Long productId;
    private Long customerId;

    public OrderDto() {
    }

    public OrderDto(Long productId, Long customerId) {
        this.productId = productId;
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getCustomerId() {
        return customerId;
    }
}
