import java.util.Arrays;
// import java.util.stream.Collectors;
// import javax.validation.constraints.NotNull;

public class VariavelInferencia {
    public static void main(String[] args) {
        var lista = Arrays.asList("JAVA", "11", null);

        // String valor = lista.stream()
        // .map((@NotNull var s) -> s.toUpperCase())
        // .collect(Collectors.joining(","));

        // System.out.println(valor);

        System.out.println(lista.size());

    }
}
