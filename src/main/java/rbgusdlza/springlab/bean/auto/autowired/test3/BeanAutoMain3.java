package rbgusdlza.springlab.bean.auto.autowired.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAutoMain3 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigAuto3.class);
        TestBeanAuto3 bean = ac.getBean("testBeanAuto3", TestBeanAuto3.class);
        System.out.println("bean = " + bean);
    }
}
