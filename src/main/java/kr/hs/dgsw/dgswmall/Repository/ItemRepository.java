package kr.hs.dgsw.dgswmall.Repository;

import kr.hs.dgsw.dgswmall.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
