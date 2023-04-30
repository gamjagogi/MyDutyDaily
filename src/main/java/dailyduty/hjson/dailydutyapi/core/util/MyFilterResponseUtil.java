package dailyduty.hjson.dailydutyapi.core.util;

/**
 *  MyFilterResponseUtil
 *
 *
 *
 *    public static void badRequest(HttpServletResponse resp, Exception e) throws IOException {
 *
 *
 *  resp.setStatus(400);
 *   resp.setContentType("application/json; charset=utf-8");
 *   이런식으로 담아서 사용.
 *   응답보낼때는 om.writeValueAsString(); 으로 쿼리스트링으로 바꿔서 응답버퍼에 getWriter().print(); 해야된다.
 *
 * forbidden(), unAuthorized() 메서드 responseDto<>를 활용, setStatus(),setContentType()설정,
 *  java객체는 json객체로 메세지컨버팅 자동으로되지만 그런 json객체를 쿼리스트링으로 인코딩해서 버퍼스트림에 출력. write()println()
 */
public class MyFilterResponseUtil {

    // public static void unAuthorized(HttpServletResponse resp, Exception e) throws IOException
    // public static void forbidden(HttpServletResponse resp, Exception e) throws IOException
}
