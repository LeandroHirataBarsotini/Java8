

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<String> valores = Arrays.asList("Fulano", "Ciclano", "Deltrano");
		
		for(String valor : valores) {
			System.out.println("parte 1: " + valor);
		}

		valores.forEach((valor -> System.out.println("parte 2: " + valor)));
		
		valores.forEach(System.out::println);
		
		List<String> reduzido = new ArrayList<String>();
		valores.forEach(valor -> reduzido.add(valor.substring(0, 3)));
		
		reduzido.forEach(System.out::println);
		
		/* forma antiga
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		*/
		
		Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		Collections.sort(valores, comparator);
		
		valores.forEach(valor -> System.out.println("ordenacao 1:" + valor));
		//valores.forEach(System.out::println);
		
		List<String> novaLista = new ArrayList<String>();
		
		valores.forEach(valor -> novaLista.add(valor));
		
		novaLista.add("abc");
		novaLista.add("xyz");
		
		novaLista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		novaLista.forEach(valor -> System.out.println("ordenacao 2: " + valor));
		
		novaLista.sort(comparator.reversed());
		
		novaLista.forEach(valor -> System.out.println("ordenacao 3: " + valor));
		
	}

}
