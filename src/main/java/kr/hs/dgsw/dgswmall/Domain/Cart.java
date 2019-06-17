package kr.hs.dgsw.dgswmall.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue
    private Long id;            //장바구니 번호
    private String userId;      // 사용자 id
    private String productId;   //제품번호
    private int quantity;       //수량
}
