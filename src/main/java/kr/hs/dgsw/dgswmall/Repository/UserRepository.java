package kr.hs.dgsw.dgswmall.Repository;

import kr.hs.dgsw.dgswmall.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
