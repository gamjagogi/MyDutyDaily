package dailyduty.hjson.dailydutyapi.core.dummy;

import dailyduty.hjson.dailydutyapi.model.board.Board;
import dailyduty.hjson.dailydutyapi.model.user.User;

// 더미데이터 작성.
public class DummyEntity {

    protected User newUser(){
        return User.builder()
                .build();
    }

    protected Board newBoard(){
        return Board.builder()
                .build();
    }
}
