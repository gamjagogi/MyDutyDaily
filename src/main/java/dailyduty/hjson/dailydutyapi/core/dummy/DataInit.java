package dailyduty.hjson.dailydutyapi.core.dummy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DataInit extends DummyEntity{
    // 더미데이터 초기화. 더미엔티티에서 객체 생성
    @Profile("dev")
    @Bean
    CommandLineRunner init(){
        return args -> {};
    }
}
