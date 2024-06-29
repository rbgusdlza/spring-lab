package rbgusdlza.springlab.bean.auto.autowired.test2;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBeanAuto2 {

    private final ObjectMapper fooObject;
    private final ObjectMapper barObject;
}
