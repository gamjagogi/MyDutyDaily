package dailyduty.hjson.dailydutyapi.model.user;


import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 칼럼
    //userId password , email, role, profile, status, 생성,업데이트

    //회원정보 수정 엔티티

}
