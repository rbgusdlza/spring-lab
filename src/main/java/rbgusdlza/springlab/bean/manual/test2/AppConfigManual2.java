package rbgusdlza.springlab.bean.manual.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigManual2 {
    // 빈 의존 관계 설정, 런타임에 적용됨
    @Bean
    public FooObject foo() {
        return new FooObject(animal());
    }

    @Bean
    public BarObject bar() {
        return new BarObject(animal());
    }

    @Bean
    public Animal animal() {
        //구현 클래스 설정
        return new Dog();
    }
}
