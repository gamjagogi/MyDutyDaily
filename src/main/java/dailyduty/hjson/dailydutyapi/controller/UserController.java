package dailyduty.hjson.dailydutyapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UserController {

    // 유저서비스
    // 유저레포지토리

    // 리스폰즈 엔티티 join()
        // 유저리스폰즈.조인dto = 유저서비스 회원가입 사용()
        // 리스폰즈dto 사용
        // 리턴 리스폰즈 엔티티

    // 리스폰즈엔티티 login(유저리퀘스트.로그인dto)
        // String jwt = userService.로그인(로그인dto)
        // 리스폰즈dto
        // 리턴 리스폰즈엔티티.ok().header(JwtProvider.header,jwt).body(리스폰즈dto)

    // @GetMapping("s/user/{id}")
    // 리스폰즈 엔티티 detail(패스베리어블 id, 어쏌티케이션프린시팔 마이유저티테일)
        // 마이유저디테일의 아이디와 id가 같은지 확인
        // 유저리스폰즈.디테일아웃dto =유저서비스.회원상세보기(id)
        // 오브젝트 매퍼.라이트밸류스트링(디테일아웃dto)
        //  리스폰즈dto에 담아서 리스폰즈엔티티에 넣어서 보낸다.


    // 리스폰즈엔티티 joinForm()
        // 리턴 user/joinForm

    // 리스폰즈엔티티 loginForm()
        // 리턴 user/loginForm

}
