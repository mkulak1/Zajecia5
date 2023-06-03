package inner.istatic;

public class Outer {
    public static class Inner {

    }

    public Inner instatiate() {
        return new Inner();
    }

    public enum MyEnum { //domyślnie statyczny
        ONE,
        TWO;
    }
    public interface MyInterface { //domyślnie statyczny

    }
}
