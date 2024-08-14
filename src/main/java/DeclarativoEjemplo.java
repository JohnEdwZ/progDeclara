import java.util.List;
import java.util.stream.Collectors;

public class DeclarativoEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
    }
}
