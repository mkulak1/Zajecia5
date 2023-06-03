package inner.ianonymous;

public class AnonymousDemo2 {
    public interface GreetingModule {
        void sayHello();
    }

    public class GreetingModuleImpl implements GreetingModule {

        @Override
        public void sayHello() {
            System.out.println("Good morning!");
        }
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModuleImpl();
        greetingModule.sayHello();
    }

    public static void main(String[] args) {
        AnonymousDemo2 anonymousDemo2 = new AnonymousDemo2();
        anonymousDemo2.someMethod();
    }
}
