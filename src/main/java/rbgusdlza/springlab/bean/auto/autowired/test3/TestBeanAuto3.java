package rbgusdlza.springlab.bean.auto.autowired.test3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBeanAuto3 {

    // 타입이 같은 후보가 셋이므로, 빈 이름으로 구분
    // 이때 빈 이름이 다르다면 NoUniqueBeanDefinitionException 발생!
    private final ObjectMapper fooObject;
    private final ObjectMapper barObject;
    private final ObjectMapper zooObject;
}
