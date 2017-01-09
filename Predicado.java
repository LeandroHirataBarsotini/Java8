import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("exbir todos os valores");
		eval(valores, valor->true);

		System.out.println("exbir somente pares");
		eval(valores, valor-> valor % 2 == 0);
		
	}
	
	public static void eval(List<Integer> lista, Predicate<Integer> predicado) {
		
		lista.forEach(valor -> {
			if(predicado.test(valor)) {
				System.out.println(valor);
			}
		});
		
	}

}
