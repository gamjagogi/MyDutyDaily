package dailyduty.hjson.dailydutyapi.core.auth;

import org.springframework.security.core.userdetails.UserDetailsService;

public class MyUserDetailsService implements UserDetailsService {

    // 유저 레파지토리 객체

    //오버라이드
    // 유저디테일객체 반환 유저네임으로유저연결(문자열) 유저네임낫파운드예외에 던져!{
    //  레파지토리에서 유저이름으로 찾기, 에러시 스트림으로 유저나파운드예외에 던지자("배드크리던셜")
    //   마이유저디테일객체 반환 } 세큐리티의 로그인시 실패핸들러가 처리할거다.

}
