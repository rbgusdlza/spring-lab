package rbgusdlza.springlab.bean.manual.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanManualMain2 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigManual2.class);

        //빈 이름과 타입으로 조회
        //수동 등록시, 빈 이름은 기본적으로 메서드 이름으로 설정
        FooObject foo = ac.getBean("foo", FooObject.class);
        BarObject bar = ac.getBean("bar", BarObject.class);

        foo.hello();
        bar.hello();

        //빈 이름으로 조회(타입 미리 알 수 없으므로 Object 반환)
        Object fooObject = ac.getBean("foo");
    }
}
