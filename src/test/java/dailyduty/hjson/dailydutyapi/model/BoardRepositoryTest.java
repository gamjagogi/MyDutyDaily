package dailyduty.hjson.dailydutyapi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@Import(BCryptPasswordEncoder.class)
@DataJpaTest
public class BoardRepositoryTest {

    //@Autowired
    //private  BoardRepository boardRepository;
    // 유저도!

    //비포이치
    // 셋업(){비크립스패스워드인코더는 뉴 해야댐
        // 유저계정 생성 = newUser(유저네임,패스워드인코더)
        // 레포지토리로 저장
        // 보드리스트 와 for문써서 보드객체 생성
        // 보드리스트에 보드객체 추가, 레포지토리로 저장}
        // em.클리어!

    //@Test
    //public void findAll_test(){ board레포.findAll}

    //@Test
    //public void findAll2_test(){보드리스트 = 보드레포.파인드올
        // 보드리스트.스트림.포이치(유저이름만 출력)}

    // 유저아이디찾기 테스트메서드()

    // 페이지리퀘스트 지정한 범위 레포지토리에서 찾기(리턴은 쿼리스트링으로 바꿔서 보내라)

    // 보드객체를 페이지객체에 넣고, 반환은 쿼리스트링,

    // 유저아이디 여러개 생성 for문이용해서.. 생성후 저장까지 테스트 메서드()

    // 파인드바이 유저아이디즈 테스트 메서드()

    // 보드레파지토리 메서드 전부 테스트
}
