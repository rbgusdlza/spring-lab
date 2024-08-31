package rbgusdlza.springlab.bean.auto.autowired.test2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfigAuto2 {

    // 같은 클래스지만 서로 다른 두 빈 생성
    // @Bean 애노테이션으로 수동 생성 -> 빈 이름은 기본적으로 메서드 이름이다.
    @Bean
    public ObjectMapper fooObject() {
        return new ObjectMapper();
    }

    @Bean
    public ObjectMapper barObject() {
        return new ObjectMapper();
    }
}
