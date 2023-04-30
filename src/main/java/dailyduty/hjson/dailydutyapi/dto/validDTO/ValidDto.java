package dailyduty.hjson.dailydutyapi.dto.validDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *  @Getter @Setter @AllArgsConstructor
 *
 *  ValidDto
 *
 *  키,밸류만 있음
 *  유효성을 위해 존재하는 dto
 *  잘못된 파라메터 -키 , 메세지 - value 전달하기도함.
 * @NotEmpty 사용
 */
@Getter @Setter @AllArgsConstructor
public class ValidDto {

}
