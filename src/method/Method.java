package method;

public class Method {

    public void sayHello() {
        System.out.println("Hello World");
    }

    //Method OverLoading
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    //Variable Argument
    public void sayHello(String... names) {
        for(String name : names) {
            sayHello(name);
        }
    }

    protected int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method a = new Method();
        a.sayHello();
        a.sayHello("Mèo Béo", "các chị");
    }

    //Signature của phương thức Java bao gồm tên và các kiểu tham số trong thứ tự khai báo.
    //Việc viết 2 method có cùng tên nhưng khác chữ ký là method overloading

}
