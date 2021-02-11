import java.util.function.BiFunction;
class Multiplications{
    public static int divide(int a, int b){
        return a/b;
    }
}
public class Main_2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplications::divide;
        int vysledok = product.apply(50, 5);
        System.out.print("Výsledok delenjaje: "+vysledok);
    }
}
