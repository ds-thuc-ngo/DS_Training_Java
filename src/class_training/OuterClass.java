package class_training;

public class OuterClass {
    int x;

    OuterClass(int x) {
        this.x = x;
    }

    public class InnerClass {

        public void print() {
            System.out.println("x = " + x);
        }

    }

    public void test() {
        InnerClass i = new InnerClass();
        i.print();
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass(17);
        o.test();
    }

}
