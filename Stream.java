

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {

		List<String> valores = new ArrayList<String>();
		valores.add("1");
		valores.add("1");
		valores.add("2");
		valores.add("2");
		valores.add("3");
		valores.add("3");
		valores.add("Fulano");
		valores.add("Ciclano");
		valores.add("Deltrano");
		valores.add("abc");
		valores.add("xyz");
		
		valores.sort(Comparator.comparing(String::length));
		
		valores.forEach(System.out::println);
		
		valores.stream()
			.filter(s -> s.length() <= 4)
			.forEach(valor -> System.out.println("filter: " + valor));
		
		valores.stream().map(String::length);
		
		IntStream intStream = valores.stream().mapToInt(String::length);
		intStream.forEach((tamanho) -> System.out.println(tamanho));
		
		valores.stream().distinct().forEach(s -> System.out.println("distinct: " + s));
		
		Optional o1 = valores.stream().max(Comparator.comparing(String::length));
		System.out.println(o1.get());
		
		Optional o2 = valores.stream().min(Comparator.comparing(String::length));
		System.out.println(o2.get());
		
		OptionalDouble media = valores.stream()
				  .mapToInt(String::length)
				  .average();
				 
		System.out.println(media.orElse(0));
		
		List<String> resultado = valores.stream()
				  .filter(s -> s.length() <= 4)
				  .collect(Collectors.toList());
		
		resultado.forEach(System.out::println);
		
	}

}
