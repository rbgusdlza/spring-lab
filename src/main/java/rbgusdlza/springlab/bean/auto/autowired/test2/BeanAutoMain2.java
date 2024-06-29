package rbgusdlza.springlab.bean.auto.autowired.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAutoMain2 {

    public static void main(String[] args) {
        //후보가 여러 개 있을 때, 빈 이름으로 구분하여 빈 자동 주입
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigAuto2.class);
        TestBeanAuto2 testBeanAuto2 = ac.getBean("testBeanAuto2", TestBeanAuto2.class);
        System.out.println("testBeanAuto2 = " + testBeanAuto2);
    }
}
