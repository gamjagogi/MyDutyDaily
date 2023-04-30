package dailyduty.hjson.dailydutyapi.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MyErrorLogRecord
 * @Targer(ElementType.METHOD)
 * @Retention(RetentionPolicy.RUNTIME)
 * 에러 저장 로그 어노테이션
 */
public @interface MyErrorLogRecord {
}
