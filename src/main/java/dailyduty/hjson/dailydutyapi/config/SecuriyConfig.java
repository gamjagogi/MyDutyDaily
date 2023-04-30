package dailyduty.hjson.dailydutyapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

// 컴밴션 : 로그.디버그("디버그  :  내용"); 스페이스 두번

// * 시큐리티를 사용안하고 단순히 Authentication만 사용할 경우, 설정.
// 1. CSRF 해제하기

// 2. frame option 해제 , h2에 접근가능

// 3. Form 로그인 설정  http.formLogin().로그인페이지패턴().로그인접근url().성공핸들러((요청,응답,어쎔티)->로그
//  마이유저디테일객체 어던티케이션.겟프린시발()
//  세션 객체 호출해서 세션객체에 SCH에 들어있는 어썬티케이션 내 프린시팔 myUserDetail객체를 넣자.getUser()
// 센드 리다이렉션(/)
// .실패핸들러((요청,응답,authException)-> {로그.warn(메세지.authException.getMessage()); }

// 4. 인증, 권한 필터 설정
//  http.인증요청(오브젝트-> 오브젝트.매칭패턴().401().anyRequest().permitAll());



@Slf4j
@Configuration
public class SecuriyConfig {

    // 빈
    // BCryptPasswordEncoder 사용하기

    // 빈
    // AuthenticationManager 객체사용 (AuthenticationConfiguration객체) throws Exception{
        // return .getAuthenticationManager(); }

    // JWT 필터 등록이 필요함
    // class CustomSecurityFilterManager extends AbstractHttpConfigurer<CustomSecurityFilterManager, HttpSecurity>{
        //  public void configure메서드를 오버라이딩. 매개변수로 HttpSecurity객체를 받는다
        //  AuthenticationManager객체 = builder.getSharedObject(AuthenticationManager.class)
        //  builder.addFilter(추가)
        //  super.configure(빌더);
        //  }


    // SecurityFilterChain 사용해서 CSRF해제하기 예외 날리고!
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        // 1. CSRF 해제하기, csrf() // 해제시, postman접근이 가능하게 된다. CSRF공격을 방어하기위해 설정한다.

        // 2. iframe 거부, 세큐리티 객체.header().frameOptions().disable();

        // 3. cors 재설정, http.cors().configurationSource(동일한 객체);

        // 4. JSessionId 사용 거부, http.ssionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)

        // 5. form 로긴 해제 (UsernamePasswordAuthenticationFilter 비활성) formLogin()만 해제.나중에 활성화 시켜야하나??

        // 6. 로그인 인증창이 뜨지않게 비활성화 httpBasic()하제

        // 7. 커스텀 필터 적용 (시큐리티 필터 교환) apply(new 커스토머세큐리티필터매니저)

        // 8. 인증 실패 처리, http.exceptionHandling().authenticationEntryPoint((request,response,authentication)->
            // {log.warn(authException.getMessage); MyFilterResponseUtil.unAuthorized(response,예외(메세지))})

        // 9. 권한 실패 처리 , 위에 인증 실패 처리와 동일 unAuthorized -> forbidden()사용

        // 10. 인증, 권한 필터 사용, http.authorizeRequests(authorize -> authorize.antMatchers().authenticated().
            // antMatcher().acess("hasRole() or").antMatcher().anyRequest().permitAll())
            // 로 특정 url패턴에 인증 권한을 준다.

        return http.build();
    }
}
