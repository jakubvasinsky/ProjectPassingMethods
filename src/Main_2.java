import java.util.function.BiFunction;
class Multiplication{
    public static int divide(int a, int b){
        return a/b;
    }
}
public class Main_2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplication::divide;
        int vysledok = product.apply(50, 5);
        System.out.println("Výsledok delenia je: "+vysledok);
    }
}