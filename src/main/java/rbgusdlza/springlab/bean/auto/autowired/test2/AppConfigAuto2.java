package rbgusdlza.springlab.bean.auto.autowired.test2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfigAuto2 {

    @Bean
    public ObjectMapper fooObject() {
        return new ObjectMapper();
    }

    @Bean
    public ObjectMapper barObject() {
        return new ObjectMapper();
    }
}
