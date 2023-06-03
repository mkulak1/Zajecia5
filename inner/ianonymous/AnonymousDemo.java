package inner.ianonymous;

public class AnonymousDemo {

    public interface GreetingModule {
        void sayHello();
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good morning");
            }
        };
        greetingModule.sayHello();
    }

    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.someMethod();
    }
}
