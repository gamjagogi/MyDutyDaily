package dailyduty.hjson.dailydutyapi.dto.user;
/**
 * UserRequest
 * log인시 body데이터에서 검증함
 * Getter만있고 Setter는 원래 없어야한다.
 * Validation 프레임워크를 gradle에 추가해야 @Valid관련 어노테이션 사용이 가능하다.
 * @NotEmpty
 * @Size(min = 3, max = 20) String에서만 size설정 가능.
 * @Email():이메일형식 , @NotBlank()"",null x 등 사용가능
 * @Patter(정규표현식, 메세지): 정규표현식을 작성하고, 메세지 전송도 가능.
 *
 * 컨트롤러에서 join(@RequestBody @Valid UserRequest.JoinDto joinDto){}를 이용해서
 * 클라이언트에서 post요청으로 보낸 (메세지컨버팅으로 자바로 바뀜)json데이터를 받는다.
 *
 * toEntity()를 dto객체에 무조건 만들어야 한다.
 * User객체.toEntity()하면 UserRequest에 맞게 매핑이 된다.
 */
public class UserRequest {
    // joinDTO class 아이디, 패스워드, 이메일, toEntity()_User엔티티 객체생성
}
