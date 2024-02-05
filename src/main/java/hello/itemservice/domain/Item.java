package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "item_name", length = 10) -> 캐멀 케이스에서 언더스코어로 자동 변환 해주기때문에 생략 가능 (userName -> user_name)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
        // JPA는 public 기본 생성자가 필수이다.
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
