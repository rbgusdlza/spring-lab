package rbgusdlza.springlab.bean.manual.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanManualMain1 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        //빈 이름과 타입으로 조회
        Foo foo = ac.getBean("foo", Foo.class);
        Bar bar = ac.getBean("bar", Bar.class);

        foo.hello();
        bar.hello();

        //빈 이름으로 조회(타입 미리 알 수 없으므로 Object 반환)
        Object fooObject = ac.getBean("foo");
    }
}
