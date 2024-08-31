package rbgusdlza.springlab.bean.manual.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanManualMain1 {

    public static void main(String[] args) {
        //ApplicationContext: 스프링 컨테이너
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigManual1.class);

        //수동 등록시, 빈 이름은 기본적으로 메서드 이름으로 설정
        //빈 이름과 타입으로 조회
        FooObject foo = ac.getBean("foo", FooObject.class);
        BarObject bar = ac.getBean("bar", BarObject.class);

        foo.hello();
        bar.hello();

        //빈 이름으로 조회(타입 미리 알 수 없으므로 Object 반환)
        Object fooObject = ac.getBean("foo");
    }
}
