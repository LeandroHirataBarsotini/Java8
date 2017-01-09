import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("aaa", "bbb", "", "ccc", "", "   ", "123", "456", "aaa", "bbb", "aaaa");
		
		List<String> filtrados = strings.stream()
										.filter(s -> ! s.trim().isEmpty())
										.distinct()
										.collect(Collectors.toList());
		
		filtrados.forEach(System.out::println);
		
		System.out.println("-----------------");
		System.out.println("parallel process");
		
		List<String> filtradosParallel = strings.parallelStream()
										.filter(s -> ! s.trim().isEmpty())
										.distinct()
										.collect(Collectors.toList());
		
		filtradosParallel.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		System.out.println("total: " + strings.stream().count() +  " total vazio: " + strings.stream().filter(s -> s.isEmpty()).count());
		
		System.out.println("-----------------");
		
		String merged = strings.stream().collect(Collectors.joining(", "));
		
		System.out.println("merged: " + merged);
		
		System.out.println("-----------------");
		
		Random r = new Random();
		r.ints()
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		List<Integer> numeros = Arrays.asList(2, 3, 2, 3, 5, 3, 7);
		
		List<Integer> numeros2 = numeros.stream().map(i -> i*i).collect(Collectors.toList());
		numeros2.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		numeros.stream().sorted().forEach(System.out::println);
		
		System.out.println("-----------------");
		
		IntSummaryStatistics estatisticas = numeros.stream().mapToInt(x -> x).summaryStatistics();
		
		System.out.println("min: " + estatisticas.getMin());
		System.out.println("max: " + estatisticas.getMax());
		System.out.println("count: " + estatisticas.getCount());
		System.out.println("sum: " + estatisticas.getSum());
		System.out.println("avg: " + estatisticas.getAverage());
		
	}

}
