

@FunctionalInterface
interface theInterface{
    void show();
}
public class Main {
    public void myMessage(){
        System.out.print(">>> Merging <<<");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        theInterface ref2 = obj::myMessage;
        ref2.show();
    }
}
