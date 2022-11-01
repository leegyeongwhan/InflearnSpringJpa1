package jpabook.jpashop.repository.order.query;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class OrderItemQueryDto {

    @JsonIgnore
    private Long orderId;
    private String itemName;//상품 명
    private int orderPrice; //주문 가격
    private int count; //주문 수량
    private List<OrderItemQueryDto> orderItems;

    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }

    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count, List<OrderItemQueryDto> orderItems) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
        this.orderItems = orderItems;
    }
}
