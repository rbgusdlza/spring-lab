package rbgusdlza.springlab.bean.manual.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigManual1 {

    @Bean
    public FooObject foo() {
        return new FooObject();
    }

    @Bean
    public BarObject bar() {
        return new BarObject();
    }
}
