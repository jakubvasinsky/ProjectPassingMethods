

@FunctionalInterface
interface theInterface{
    void show();
}
public class Main {
    public void myMessage(){
        System.out.println(">>> Example message <<<");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        theInterface ref = obj::myMessage;
        ref.show();
    }
}