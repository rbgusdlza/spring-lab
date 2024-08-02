package rbgusdlza.springlab.bean.manual.test2;

public class FooObject {

    private final Dog dog;

    // @RequiredArgsConstructor 로 대체 가능
    public FooObject(Dog dog) {
        this.dog = dog;
    }

    public void hello() {
        System.out.println("foo dog: " + dog.bark());
    }
}
