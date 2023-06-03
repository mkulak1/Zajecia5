package inner;

public class A {
    int x = 1;
    public class B {
        int x = 2;
        public class C {
            int x = 3;

        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();

        System.out.println(a.getClass() + " x= " + a.x);
        System.out.println(b.getClass() + " x= " + b.x);
        System.out.println(c.getClass() + " x= " + c.x);
    }
}
