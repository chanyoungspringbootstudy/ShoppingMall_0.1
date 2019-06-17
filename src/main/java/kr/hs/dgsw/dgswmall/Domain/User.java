package kr.hs.dgsw.dgswmall.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;

    private String password;    //비밀번호
    private String name;        //이름
    private String call;        //유선
    private String phone;       //휴대폰
    private String postal;      //우편번호
    private String address;     //주소
    private String email;

    @CreationTimestamp
    private LocalDateTime registered; //가입일시

    public User(String id, String password, String name, String call, String phone, String postal, String address, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.call = call;
        this.phone = phone;
        this.postal = postal;
        this.address = address;
        this.email = email;
    }
}
