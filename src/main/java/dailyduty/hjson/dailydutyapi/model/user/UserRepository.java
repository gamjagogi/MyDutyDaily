package dailyduty.hjson.dailydutyapi.model.user;

import java.util.Optional; // 이게 들어가야 Optional사용가능.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;

public interface UserRepository extends JpaRepository<User,Long> {
    // username으로 db에서 정보찾기 (쿼리) Optional객체 사용!

    @Query("select u from User u where u.username = : username")
    Optional<User> findByUsername(@Param("username") String username);
}
