import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    public static void main(String[] args) {
        MinhaPrimeiraED ed = new MinhaPrimeiraED();

        ed.adiciona("Primeiro");

        for(Object objeto : ed.objetos){
            System.out.println(objeto);
        }
    }
}
