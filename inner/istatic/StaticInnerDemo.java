package inner.istatic;

public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.instatiate();
        Outer.Inner inner2 = new Outer.Inner(); //zgrabny sposób

        Outer.MyEnum one = Outer.MyEnum.ONE;
    }
}
