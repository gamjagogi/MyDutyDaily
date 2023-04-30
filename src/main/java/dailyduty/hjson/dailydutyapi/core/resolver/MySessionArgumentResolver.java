package dailyduty.hjson.dailydutyapi.core.resolver;
/**
 *  @RequiredArgsConstructor
 *   @Configuration
 *  MySessionArgumentResolver
 *
 *  HandlerMethodArgumentResolver를 구현한다
 *  supportsParameter(){parameter.getParameterAnnotation(MySessionStore.class) 어노테이션이있는지 확인}
 *  resolverArgument(){ session.getAttribute("sessionUser"); 세션값을 반환 }
 *
 * 추가 설명
 * HandlerMethodArgumentResolver인터페이스는 컨트롤러 메서드의 파라메터값을 가져와서
 * supportsParameter(MethodParameter parameter)
 *
 * **그릇판별 기능 (@MySessionStore가 달린 값이, 세션값을 받을 수있는 파라메터인지 아닌지 체크)
 * WebMvcConfig에 설정해야 사용가능.
 *
 * @MySessionStore 어노테이션을 메서드 파라메터에 넣어서, 바로옆에 객체가
 * supportsParameter의 조건에 맞다면, getSession()을 통해, 세션값을 주입한다.
 *
 * 메서드의 파라메터(@MySessionStore)가 세션에 파라메터 값을 받을 수있는지 유효성 체크를 하는 객체이다.
 * @MySessionStore 어노테이션이 달린 파라메터가 Session에 담긴 SessionUser객체를 받을수있는지 유효성을 체크한는 객체이다.
 *
 * HandlerMethodArgumentResolver를 사용해서
 * 기본형 파라메터 (Integer, String 등)값을 객체에 매핑하는 기능을 구현한다.
 *
 * boolean supportsParameter(MethodParameter parameter)메서드에서
 * MethodParametor parametor에 getParameterAnnotation(어노테이션객체) 어노테이션객체가 존재하는지 확인. 있으면 true,없으면 false.
 *
 * resolveArgument()메서드에서 resolve수행. session에 담긴값을 그대로 반환해서 사용한다는거다.
 */
public class MySessionArgumentResolver {
}
