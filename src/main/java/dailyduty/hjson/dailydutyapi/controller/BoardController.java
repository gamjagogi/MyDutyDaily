package dailyduty.hjson.dailydutyapi.controller;

public class BoardController {

    //겟매핑(/와 /보드)로 오면 일로!
    //main(리퀘스트파람(디폴트설정="0")int page,모델객체) 페이지리퀘스트 페이지 = 페이지리퀘스트.of(페이지,사이즈, 솔트바이.디센딩())
        // 페이징객체에 담기 = 서비스 객체 글목록보기메서드(page)사용.
        // (뷰)모델에.addAttribute(,)리턴 jsp 메인파일 경로 board/main

    // 로그인 인증 된 패턴만! 세이브폼 메서드 세이브폼 접근!

    // 로그인 인증 된 패터만! 세이브메서드(DTO,@AuthenticationPrincipal)
        // {서비스객체의 글쓰기메서드사용(세이브DTO,어썸디케이션 아이디 )리턴 리다이렉션 /}

    // 보드 디테일(패스배리어블 id ,모델){보드서비스.게시글상세보기 메서드 사용; 모델에 꺼낸 보드넣고(dto를사용) 리턴 디테일! }
}
