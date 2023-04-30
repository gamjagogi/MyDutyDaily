package dailyduty.hjson.dailydutyapi.model.board;

public class BoardQueryRepository {
    // 보드안에 객체 가져올떄 필요있을떄!!
    // 엔티티 매니저
    // 페이지 반환 findAll(int page){
            // 리스트 보드 = 엔티티매니저로.크레이트쿼리(보드객체를 불러오는대 조인패치로 보드유저 order by b.id desc )
            // 셋퍼스트레절트.셋맥스레절트.겟레절트리스트()
            // 토탈카운트 = 크레이트쿼리(보드의 갯수가져오기 ,롱).겟싱글레젤트();
            // 리턴 뉴 페이지임플<>(보드리스트PS,페이지블,영속된 페이지사이즈)}

    // 서브쿼리() {
        // String sql = select id,title,content, (select count(id)from love)like_count from board}
                // like_count 같은 가로안에 기능을 가진 칼럼을 dto에 넣을때 사용
        // Query query = em.createNativeQuery(sql)
        // JpaResultMapper result객체사용
        // result.uniqueResult(query,dto 생성)을 dto생성객체 넣는다

    // 클래스 dto 생성{ id,title,content,like_count 필드를 넣는다.}

    // gradle에 qlrm추가!
}
