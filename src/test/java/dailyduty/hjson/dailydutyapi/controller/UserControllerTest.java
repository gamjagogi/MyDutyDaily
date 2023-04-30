package dailyduty.hjson.dailydutyapi.controller;

import dailyduty.hjson.dailydutyapi.core.MyRestDoc;
import dailyduty.hjson.dailydutyapi.core.dummy.DummyEntity;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

@DisplayName("회원 API")
@AutoConfigureRestDocs(uriScheme = "http", uriHost = "localhost", uriPort = 10000)
@ActiveProfiles("test")
@Sql("classpath:db/teardown.sql")
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class UserControllerTest extends MyRestDoc {

    //**when에서 perform(get(실제 컨트롤 메서드 패턴 작성))

    // private DummyEntity dummy 사용

    //@Autowired
    //private MockMvc mvc; , UserRepository, EntityManager를 오토와이어로 필드에서 연결

    //@BeforeEach사용 setUp(){레포지토리(더미.뉴())로 저장하는대 적당히 아이디, 패스워드정도만!, em.clear()}

    //@DisplayName("회원가입 성공") @Test 사용
    // join_test()메서드 throws Exception {}
        // *given
        // UserRequest.JoinDTO를 사용해서, 조인dto로 객체를 만들어서, om.writeValueAsString()를 사용해서 스트링객체에 담는다.
        // *when
        // ResulteActions객체 = mvc.perform(post().content().contentType());
        // resulteActions.andReturn().andResponse().getContentAsString()해서 스트링객체에 넣는다
        // 테스트삼아 println()해보고
        // *then
        // resultActions.andExpect(jsonPath("$.").value())를 사용해서 특정 value로 값으로 json값을 지정
        // resultActions.andExpect(status().isOk())
        // resultActions.andDo(MockMvcResultHandlers.println()).andDo(document);

        // 만약 then에서 토큰을 넣으려면,
        // String jwtToken = resultActions.andReturn().getResponse().getHeader(MyJwtProvider.HEADER);
        // Assertions.assertThat(jwtToken.startsWith(MyJwtProvider.TOKEN_PREFIX)).isTrue();
        // ResultActions.andExpect(status().isOk());

    //@Distplay("회원가입 실패")
    // join_fail_bad_request_test() throws Exception{}
        // 위에 성공메서드처럼, 이번에는 실패를 전제로하는 과정을 작성해라.
        // 형태는 위와 동일하고, 비포이치에서 이미 만든 User객체를 만들어서,이미 존재하는 userid라 실패하는걸 넣자.
        // resulteActions.andExpect(status, msg, key(원인)같은걸 하나넣어라), value(설명))을 사용해라.
        // 마지막에 andDo(MockMvc핸들러!)

    //로그인성공,실패 , login_test()만들자. given에서ㅓ setUserId(), setPassword()넣고, 스트링 객체로 인코딩해라!
        // when에서 resultActios=mvc.perform(메소드(패턴), 콘텐트(바디), 콘텐트타입)
        // 인코딩해서 스트링객체 넣고, then에서 위에 성공,실패처럼 , value설정해주고,status().상태코드넣고, andDo()
        // andDo()

    // 회원상세보기 성공
    // 기존 메서드 어노테이션에서 하나더 추가, @WithUserDetails(value = "", setupBefore = TestExecutionEvent.TEST_EXECUTION)
        //given id=iL
        // when perform(get("/s/user/"+id))로 요청이 올때!
        // then data.id, userid,email등.value() 정보를 준다.
        // andDo()
    // 회원상세보기 실패시 권한메서드, 인증안됨 메서드를 둘다 만든다.
}
