package dailyduty.hjson.dailydutyapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {
    // 레포지토리 객체!

    // 트랜잭션
    // 글쓰기(리퀘스트dto사용, Long id){
            //전체 트라이캐치 - 서비스에서 레파지토리 관련 예외 전부 처리!
        //     1 유저존재 확인 바로 에러처리
        //     2 썸네일 만드리 = MyParseUtil.겟썸네일(saveDTO.getContent()); 썸네일 html에서 <img src="${}"사용가능>
        //     3 게시글 쓰기 레파지토리에 저장하고 응답 }

    //트랜잭션(리드온리 = 트루) 변경 감지하지마!!
    // 페이지 객체반환 글목록보기(페이지객체){ DTO객체로 바꿔서 프론트에 전달.
        // 페이지객체 영속화 = 보드에서 findAll(페이지객체)
        // 보드영속화객체.스트림.포이치.겟유저.겟유저네임()
        // 리턴 페이지 영속화 }

    // 보드 게시글 상세보기(id){
        //  레포지토리에 findBy페치유저(id)로 보드안에 유저도 떙겨온다. 서비스는 에러처리해야하는거 알지?
        // 리턴 영속화된보드! }
}
