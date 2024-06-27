package rbgusdlza.springlab.bean.auto.autowired;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FooObjectAuto {

    @Autowired
    private final BarObjectAuto bar;

    public void hello() {
        System.out.println("foo");
    }
}
