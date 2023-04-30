package dailyduty.hjson.dailydutyapi.core.filter;
/**
 *  JwtVerifyFilter
 *  Filter를 구현
 *  doFilter()메서드를 오버라이딩
 *
 *
 * 1. 서블릿 -> http서블릿
 * 2. 요청 헤더에 jwt헤더 가져오기
 * ㄴ MyFilterResponseUtil.badRequest(resp,new Exception400(JwtProvider.HEADER,"토큰이 전달되지 않았습니다.")); //에러발생한 파라메터, 에러메세지 ResponseDto.fail()에 담은 valid데이터
 * 3. 헤더 없으면 예외처리 400
 * 4. bearare만 제거한다.
 * 5. jwt를 전체적으로 디코딩한다 (base64만 디코딩) DecordedJWT객체 사용
 *    JwtProvider.verify()메서드로 토큰 검증. (디코딩)그후 id, role값만 DecordedJWT로 꺼냄(asLong(),asString())
 * 6. 세션 사용, 위에 id,role로 세션에 담을 객체 생성(login객체),세션에 담기
 * 7. 다음 처리할 필터가 있을수있기에 chain.doFilter()사용
 * 8. 디코딩하는 과정까지는 적어도 try캐치로 처리해야되고, 토큰만료,시크릿키검증실패 예외처리
 *    토큰에 id,role을 가져다가 세션에 담음.
 */
public class JwtVerifyFilter {

}
