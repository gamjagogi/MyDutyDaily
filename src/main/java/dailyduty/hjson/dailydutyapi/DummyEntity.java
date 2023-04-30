package dailyduty.hjson.dailydutyapi;

import dailyduty.hjson.dailydutyapi.model.user.User;

// 더미데이터 작성.
public class DummyEntity {

    protected User newUser(){
        return User.builder()
                .build();
    }
}
