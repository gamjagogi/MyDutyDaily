package dailyduty.hjson.dailydutyapi.core.jwt;
/**
 *  JwtProvider
 *
 *  create(), verify() 메서드 public static으로 작성
 *
 * jwt를 공급하는기능.
 * private statci final String SUBJECT,int EXP(만료시간),String TOKEN_PREFIX,String HEADER,String SECRE
 *  JWT.create()
 *  withSubject,withExpiresAt,withClaim,withClaim,sign(Algorithm.HMAC512(SECRET))를 사용, TOKEN_FREFIX + jwt로 반환
 *
 *  DecodedJWT verify() throws SignatureVerificationException, TokenExpiredException
 *  DecodedJWT객체사용   DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC512(SECRET))
 *  decodedJWT 반환
 */
public class JwtProvider {
}
