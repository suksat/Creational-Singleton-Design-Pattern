package singleton;

public class MainDemo {
    public static void main(String[] args) {
        SingletonClass singletonObject = SingletonClass.someMethod();
        singletonObject.showMessage();
        //        Singleton singleton = new Singleton(); // not possible in Singleton
    }



}