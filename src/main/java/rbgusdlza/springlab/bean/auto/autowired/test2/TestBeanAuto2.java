package rbgusdlza.springlab.bean.auto.autowired.test2;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBeanAuto2 {

    // @Autowired 자동 생성
    // 자동 주입을 받을 때, 필드와 같은 클래스의 빈을 주입시킨다.
    // 같은 클래스가 두개 이상이라면, 필드명과 같은 이름을 가진 빈을 주입시킨다.

    private final ObjectMapper fooObject;
    private final ObjectMapper barObject;
}
