package rbgusdlza.springlab.bean.auto.autowired.test1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FooObjectAuto {

    // @RequiredArgsConstructor 가 생성자 생성 -> 생성자가 하나일 때, 스프링이 @Autowired 자동 설정
    // 의존 관계 자동 주입
    private final BarObjectAuto bar;

    public void hello() {
        System.out.println("foo");
    }
}
