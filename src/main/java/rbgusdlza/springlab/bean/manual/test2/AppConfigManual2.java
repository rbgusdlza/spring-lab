package rbgusdlza.springlab.bean.manual.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigManual2 {

    @Bean
    public FooObject foo() {
        return new FooObject(dog());
    }

    @Bean
    public BarObject bar() {
        return new BarObject(dog());
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
