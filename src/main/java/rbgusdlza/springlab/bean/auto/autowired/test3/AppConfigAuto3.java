package rbgusdlza.springlab.bean.auto.autowired.test3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfigAuto3 {

    @Bean
    public ObjectMapper fooObject() {
        return new ObjectMapper();
    }

    @Bean
    public ObjectMapper barObject() {
        return new ObjectMapper();
    }

    @Bean
    public ObjectMapper zooObject() {
        return new ObjectMapper();
    }
}
