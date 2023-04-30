package dailyduty.hjson.dailydutyapi.core.advice;
/**
 * MyValidAdvice
 *
 * @Aspect, @Component
 * 유효성검사 관련 기능의 공통 코드 (post,put요청시 @Vaild어노테이션을 검출된 에러 발견시 validationAdvice메서드 호출)
 *
 * postMapping, putMapping 어노테이션 사용시, 에러체크, 에러시, Exception400(bad Request)객체를 만든다.
 *  @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
 *     public void postMapping(){
 *     } 이런 메서드 추가. 포인트컷으로 어노테이션 경로 설정 필수.
 *
 * JoinPoint jp를 매개에 담아서 사용. jp.getArgs()로 메서드의 매개변수값들을 오브젝트 배열로 가져온다.
 *
 * Errors 객체의 errors.hasErrors()가 true면 throw new동시에 key(파라메터),value(메세지)형태의 Exception400 객체를 생성한다.
 * 반환된 Exception400객체는 ResponseDto.fail(상태,"메세지",new ValidDto(key,value)) 키,밸류값을 넣어서, 전송할수있다.
 */
public class MyValidAdvice {
}
