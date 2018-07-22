package unit1;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello runnable!");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Hello myLambdaThread"));
        myLambdaThread.run();

        Runnable runnableLambda = () -> System.out.println("Hello runnableLambda!");
        runnableLambda.run();
    }

}
