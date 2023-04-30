package dailyduty.hjson.dailydutyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyDutyApiApplication {

    //프로파일(데브) -테스트용이다.
    // 빈
    // 커맨드라인 init(레포지토리, 패스워드 인코더){ return args -> { User ssar = User생산!!! 그리고 레파지토리에 세이브
    // 보드리스트=어레이리스트
    // for(){
    // 보드리스트.add(newBoard(타이틀+i, 유저객체))}}
    // 이러면 insert 여러차례 들어간다.
    public static void main(String[] args) {
        SpringApplication.run(DailyDutyApiApplication.class, args);
    }

}
