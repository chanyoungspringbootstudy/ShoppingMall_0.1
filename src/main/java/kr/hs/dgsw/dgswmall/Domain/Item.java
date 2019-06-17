package kr.hs.dgsw.dgswmall.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    private Long id;    //제품번호

    private String name;            //제품명
    private String category;        //카테고리
    private String manufacturer;    //제조업체
    private int originalPrice;      //시중가격
    private int salePrice;          //판매가격

}
