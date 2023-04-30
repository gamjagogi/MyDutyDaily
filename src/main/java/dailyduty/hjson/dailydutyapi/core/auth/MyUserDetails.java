package dailyduty.hjson.dailydutyapi.core.auth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Setter
public class MyUserDetails implements UserDetails {

    // 유저객체
    // 생성자 - 유저 주입
    // 생성해야될게 여러개면, public void changeSession(User user){this.user = user;}

    //오버라이딩
    //반환값은 콜렉션<그랜트인증 상속> 권한가져오기()
        //콜렉션은 어레이리스트
        //콜렉션에 권한 넣고 반환


}
