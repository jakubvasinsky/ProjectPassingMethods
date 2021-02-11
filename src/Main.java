interface Callable {
    public void call(int param);
}

class Test implements Callable {
    public void call(int param) {
        System.out.println( param );
    }
}

public class Main{
    public static void invoke(Callable callable, int param){
        callable.call(param);
    }
    public static void main(String []args){
        Callable cmd = new Test();
        invoke(cmd, 10);

    }
}