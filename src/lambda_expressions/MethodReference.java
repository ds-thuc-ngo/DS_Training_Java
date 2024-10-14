package lambda_expressions;


import java.util.Arrays;

interface ExecuteFunction {
    public int execute(int a, int b);
}

interface SayHello {
    void display(String msg);
}

class MathUtils {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

}

class SumMinus {
    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}

class Hello implements SayHello {

    public Hello(String msg) {
        System.out.print(msg);
    }

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }
}

public class MethodReference {

    // Ý tưởng là reference 1 method của obj chứ không cần reference cả obj
    //Một method reference là cú pháp ngắn của lambda expression giúp thực thi một method.
    //Syntax: Object :: methodName

    public static int doAction(int a, int b, ExecuteFunction fun) {
        return fun.execute(a, b);
    }


    public static void main(String[] args) {

        //Static method references
        int a = 10;
        int b = 7;

        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum);

        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus);

        //Tham chiếu đến một instance method của một đối tượng cụ thể
        SumMinus sumMinus = new SumMinus();
        sum = doAction(a, b, sumMinus::sum);
        System.out.println(a + " + " + b + " = " + sum);
        minus = doAction(a, b, sumMinus::minus);
        System.out.println(a + " - " + b + " = " + minus);

        //Tham chiếu đến một instance method của một đối tượng tùy ý của một kiểu cụ thể
        String[] stringArray = {"Java", "C++", "PHP", "C#", "Javascript"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }

        //Tham chiếu đến một constuctor
        SayHello ref = new Hello("Chị Dương ");
        ref.display("xinh vl");

    }
}
