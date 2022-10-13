package jpabook.jpashop.repository.order.query;


import lombok.Data;

@Data
public class OrderItemQueryDto {


    private  Long id;
    private String itemName;//상품 명
    private int orderPrice; //주문 가격
    private int count; //주문 수량

    public OrderItemQueryDto(Long id, String itemName, int orderPrice, int count) {
        this.id = id;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
