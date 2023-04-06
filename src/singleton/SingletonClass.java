package singleton;

public class SingletonClass {
    private static SingletonClass someInstanceVariable = new SingletonClass();
    private SingletonClass(){}

    public static SingletonClass someMethod(){
        return someInstanceVariable;
    }

    public void showMessage(){
        System.out.println("Singleton output !");
    }
}

