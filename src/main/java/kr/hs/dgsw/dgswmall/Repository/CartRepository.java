package kr.hs.dgsw.dgswmall.Repository;

import kr.hs.dgsw.dgswmall.Domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
