package dailyduty.hjson.dailydutyapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    // 어썸티케이션매니저
    // 레파지토리
    // 패스워드 인코더

    //마이로그
    //트랜잭션 (더티체킹, DB 세션 종료)
    // 유저리스폰즈.조인outDTO 회원가입( 유저리퀘스트.조인DTO )
        // 먼저 유저이름으로 db에 유저찾는다.옵셔널로 사용하고, isPresent()가 있는지만 확인
        // 1. 패스워드 암호화
            //유저리퀘스트.joinDto로 패스워드 저장. 
        // 2. DB 저장
        // db세이브되는 쪽만 트라이 캐치 ( insert, update, delete 는 트라이캐치 처리)


    //마이로그
    // 유저리스폰즈.디테일아웃dto 회원상세보기(id)
        // 아이디 조회
        // 유저리스폰즈.디테일아웃dto()로 담아서 리턴


    //마이로그
    // 스트링 로그인(유저리퀘스트.로그인dto)
        // 필터쪽이라 JPA가 알아서 예외를 잡아주지 못한다 그래서 전체 트라이캐치로 잡고 throw new 401
        // 유저네임패스워드어쎔티케이션토큰 객체(유저네임,유저패스워드) 사용
        // 어쏌티케이션 객체 = 어쏌티케이션매니저.어쏌티케이트(토큰)
        // 마이유저디테일 객체 = (캐스팅)어썸티케이션.겟프린시팔()
        // 리턴 Jwt프로바이더.크레이트(마이유저디테일.겟유저)

    //마이로그
    //트랜잭션
    // 유저 프로필수정()
}
