package rbgusdlza.springlab.bean.manual.test2;

public class FooObject {
    // 구체 타입에 의존 x, 런타임에만 알 수 있다.
    private final Animal animal;

    // @RequiredArgsConstructor 로 대체 가능
    public FooObject(Animal animal) {
        this.animal = animal;
    }

    public void hello() {
        System.out.println("foo animal: " + animal.bark());
    }
}
