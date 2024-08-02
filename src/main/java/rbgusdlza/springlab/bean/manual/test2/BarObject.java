package rbgusdlza.springlab.bean.manual.test2;

public class BarObject {

    private final Dog dog;

    // @RequiredArgsConstructor 로 대체 가능
    public BarObject(Dog dog) {
        this.dog = dog;
    }

    public void hello() {
        System.out.println("bar dog: " + dog.bark());
    }
}
