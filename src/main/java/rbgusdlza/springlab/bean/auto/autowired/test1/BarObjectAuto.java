package rbgusdlza.springlab.bean.auto.autowired.test1;

import org.springframework.stereotype.Component;

//@Component 애노테이션을 이용해 자동 빈 등록 -> 빈 이름은 클래스 이름이다.
@Component
public class BarObjectAuto {

    public void hello() {
        System.out.println("bar");
    }
}
