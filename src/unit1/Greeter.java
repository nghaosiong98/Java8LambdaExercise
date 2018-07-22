package unit1;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting myLambdaFunction = () -> System.out.println("Hello world from lambda function!");

        LambdaAdd addFuntion = (int a, int b) -> a + b;

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world from innerclass");
            }
        };

        greeter.greet(myLambdaFunction);
        greeter.greet(innerClassGreeting);
    }
}

//interface MyLambdaType{
//    void foo();
//}

@FunctionalInterface
interface LambdaAdd{
    int sum(int a, int b);
}