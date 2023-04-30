package dailyduty.hjson.dailydutyapi.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    // username으로 db에서 정보찾기 (쿼리) Optional객체 사용!
}
