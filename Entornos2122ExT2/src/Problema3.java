public class Problema3 {

    private boolean Fizz(Integer Fizz){
        return Fizz % 3 == 0;
    }
    private boolean Buzz(Integer Buzz){
        return Buzz % 5 == 0;
    }
    private Integer FizzBuzz(Integer FizzBuzz){
        if (FizzBuzz % 3 == 0){
            System.out.println(FizzBuzz);
        }
        else if (FizzBuzz % 5 == 0){
            System.out.println(FizzBuzz);
        }
    return FizzBuzz;
    }
    private boolean Foo(Integer Foo){
        return Foo % 7 == 0;
    }
    private boolean Boo(Integer Boo){return Boo % 11 == 0;}

    public static void main(String[] args) {
        Fizz();
        Buzz();
        FizzBuzz();
        Foo();
        Boo();
        System.out.println(Fizz());
        System.out.println(Buzz());
        System.out.println(FizzBuzz());
    }

    private static void Foo() {
    }

    private static void Boo() {
    }

    private static boolean FizzBuzz() {
        return false;
    }

    private static boolean Buzz() {
        return false;
    }

    private static boolean Fizz() {
        return false;
    }

}
