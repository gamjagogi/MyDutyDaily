package dailyduty.hjson.dailydutyapi.core.util;

public class MyParseUtil {
    // get썸네일(스트링 html){
        //  필드 : 스트링 썸네일, Document doc = Jsoup.parse(html), Elements els = doc.select("img");
        //  els.size==0 이면, 디폴트 경로의 png파일을 쓴다. 존재하면, Element el = els.get(0)가져와서,
        //  썸네일 = el.attr("이미지소스")로 바꾸어, 이미지 파일로 교체해준다.
        // 리턴 썸네일 }
}
