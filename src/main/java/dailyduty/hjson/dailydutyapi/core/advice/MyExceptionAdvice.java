package dailyduty.hjson.dailydutyapi.core.advice;

/**
 *  @Slff4j, @RequireArgConstructor @RestControllerAdvice
 *
 *  MyExceptionAdvice
 *
 *  예외 처리 공통코드(ResponseEntity)
 *  예외 발생시, 에러에 맞게, body,상태코드를 응답
 *
 *  csr예외 사용시 리스폰즈엔티티로 응답,  @ExceptionHandler(예외객체)넣어라.
 *
 *  ssr로 응답시 리턴 스크립트백(e.메세지)으로 응답
 *     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
 *     @ExceptionHandler(Exception500.class)
 *     public @ResponseBody String serverError(Exception500 e, MyUserDetails myUserDetails) {
 *         if(myUserDetails.getUser() != null){
 *             log.error("에러 발생 : "+e.getMessage());
 *         }
 *         return Script.back(e.getMessage());
 *     }
 *     ssr메서드는 꼭 @ResponseStatus(상태) 넣어라.
 *
 *  @ExceptionHandler()매개에 들어온 클래스가 생성되면,@ExceptionHandler가 달린 메서드가 호출된다.
 *  예외 Advice이기에 모든 예외처리가 가능해야된다..(ResponseEntity<>(객체,상태))로 응답.
 *
 *
 * 모든 예외처리 메서드는 ResponseEntity<>(예외body,상태)를 반환
 * @ExceptionHandler(Exception.class)어노테이션으로 예외객체 의존성 주입.
 * 메서드형태는 예외명(매개변수:예외객체)로 한다.
 *
 * 404에러 not found는 따로 클래스로 안만들고 메서드로 만들어서 바로 사용, 있으면 가져와서 사용
 *
 * 500서버에러(ExceptioApi500,MyUserDetails)는,
 * HttpStatus.INTERNAL_SERVER_ERROR 상태를 fail에 담아 응답. 유저없으면 에러로그, 유저있으면 바디로 응답
 *
 *  unknownServerError(Exception e, MyUserDetails){유저 없으면 로그남기고, 있으면 리스폰즈dto 바디로 응답}
 *
 * @MyErrorLogRecord 어노테이션을 MyErrorLogAdvice를 사용해 만들었다면, 각 예외마다, @MyErrorLogRecord를 붙인다.
 *
 *
 * // trace -> debug -> info -> warn -> error
 */

public class MyExceptionAdvice {
}
