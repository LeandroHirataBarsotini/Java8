

import java.util.HashMap;
import java.util.Map;

public class MethdoReference {

	public static void main(String[] args) {
		
		Map<String, Double> mapa = new HashMap<String, Double>();
		
		mapa.put("Fulano", 1000D);
		mapa.put("Ciclano", 2020D);
		mapa.put("Deltrano", 12000D);
		
		Map<String, Double> copia1 = new HashMap<String, Double>();
		mapa.forEach((nome, salario) -> copia1.put(nome, salario));
		
		Map<String, Double> copia2 = new HashMap<String, Double>();
		mapa.forEach(copia2::put);
		
		copia1.forEach((nome, salario) -> System.out.println("nome: " + nome + "salario: " + salario));
		
		copia2.forEach((nome, salario) -> System.out.println("nome: " + nome + "salario: " + salario));

	}

}
