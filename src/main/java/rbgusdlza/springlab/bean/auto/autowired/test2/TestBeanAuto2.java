package rbgusdlza.springlab.bean.auto.autowired.test2;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBeanAuto2 {

    //빈 자동 주입 받을 때, static으로 설정되어 있을 경우 자동 주입되지 않는다.
    //static 영역은 클래스가 로딩 시점에 초기화되기 때문(빈 라이프 사이클과도 호환 x)
    private final ObjectMapper fooObject;
    private final ObjectMapper barObject;
}
