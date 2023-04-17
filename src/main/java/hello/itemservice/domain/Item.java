package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //해당 어노테이션이 있어야 JPA가 인식.
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ITEM_NAME" , length = 10) //생략해도 스프링부트와 통합해서 사용하면 카멜케이스는 지원해준다.
    private String itemName;
    private Integer price;
    private Integer quantity;

    //JPA에서는 기본생성자가 필수이다.
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
