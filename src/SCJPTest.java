/**
 * Created by Dravit on 5/11/2015.
 */
public class SCJPTest {

    public static void main(String[] args) {
        B a = new B((short)1290000000);
        a.func1();
        B b = null;
        B.staticFuncCall();
    }
}

class A {
    public A(int a) {
        System.out.println(a);
    }
    void func1() {
        System.out.println("Class A");
    }
}

class B extends A {
    public B(short b) {
        super(b);
        System.out.println(b);
    }
    public void func1() {
        System.out.println("Class B");
    }

    public static void staticFuncCall() {
        System.out.println("!111111111111");
    }
}