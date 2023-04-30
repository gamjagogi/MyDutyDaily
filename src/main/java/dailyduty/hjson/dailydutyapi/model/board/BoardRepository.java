package dailyduty.hjson.dailydutyapi.model.board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {

    //쿼리 findByDistinct() 배열이 아닌 구분된 문자열로 모든 보드아이디의 유저들을 불러오기

    //쿼리 findByUserIds() 각 보드에 유저아이디만 싹 떙겨오기 리스트로!! in : List userIds

    //쿼리 findByUserId() 각 보드에 유저아이디로 다 가져오기 리스트로! : Long userId

    //쿼리 findByFetcher() 보드에 유저객체 싹다 떙겨오기 List<Board>
}
