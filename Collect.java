import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String ... args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("abc");
		lista.add("teste");
		lista.add("abc");
		
		lista.stream()
			.sorted()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.forEach((k, v) -> System.out.println("valor: " + k + "\ntotal: " + v));
			
	}
	
}
