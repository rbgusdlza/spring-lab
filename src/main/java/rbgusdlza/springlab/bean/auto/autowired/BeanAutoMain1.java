package rbgusdlza.springlab.bean.auto.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAutoMain1 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigAuto.class);

        //자동 등록시, 빈 이름은 기본적으로 클래스 이름으로 설정
        FooObjectAuto fooObjectAuto = ac.getBean("fooObjectAuto", FooObjectAuto.class);
        BarObjectAuto barObjectAuto = ac.getBean("barObjectAuto", BarObjectAuto.class);

        fooObjectAuto.hello();
        barObjectAuto.hello();
    }
}
