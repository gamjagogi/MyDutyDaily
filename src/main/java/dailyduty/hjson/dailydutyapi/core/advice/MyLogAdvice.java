package dailyduty.hjson.dailydutyapi.core.advice;
/**
 *  @Aspect
 * @Component
 * @RequiredArgsConstructor
 *
 *  MyErrorLogAdvice  : 에러 로그만 처리!
 *
 *  error어드바이스
 * 에러(예외)발생시, 로그를 작성하는 어드바이스
 *
 * @myErrorLogRecord 어노테이션을 넣은 메서드가 호출될때 호출된다.
 * public void method(JointPoint jp){
 *     Object[] args = jp.getArgs()
 * } 이러면,
 *
 * 해당 메서드를 JoinPoint로 가져온다.
 * 가져온 메서드가 Exeception이라는게 검증되면, 세션 sessionUser에 값이 있는지 확인하고,
 * 값을 갖고있다면, 해당 값으로 ErrorLog엔티티에 맞게 값을 builder하고
 * ErrorLogRepository.save()로 저장한다.
 *
 * ******ErrorLog객체 안쓸경우, 파라메터에 예외가 확인되면, log.error("에러": e.getMessage())
 *
 * @annotation - MyErrorLogAdvice가 실행될때, @PointCut("@annotation")으로 지정해둬야 한다.
 * @Pointcut이 달린 메서드가 실행될때, @Before()가 달린 advice메서드를 실행시켜서, 구체적으로 에러 로그를 단다.
 * @Aspect, @Component @RequireArgsConstructor
 *  오브젝트 객체로 된 list를 사용해서 해당 객체가 Exception이면, 로그를 저장한다.
 *  (로그인유저가 맞는지)세션에서 user정보를 가져오는대,있을경우 에러로그를 저장한다.
 *  ErrorLogRepository.save를 활용해서, 로그를 저장한다.
 */
public class MyLogAdvice {

    // 포인트컷(애노테이션 마이로그경로)
    // public void myLog(){} 비어있는 메서드만 만든다.

    // @AfterReturning("myLog()")
    // public void logAdvice(JoinPoint jp) throws Exception{
        // 메소드시규내튜얼객체 = Jp.겟시규내튜얼 사용
        // 메소드 = getMethod();
        // log.debug(디버그: 메소드네임 + : 성공 )}

    // myErrorLog() 제일위에 주석보고 작성
}
