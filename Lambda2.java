
public class Lambda2 {

	public static void main(String[] args) {
		
		int valor1 = 10;
		int valor2 = 2;
		
		Calculo soma = (int a, int b) -> a + b;
		Calculo subtracao = (int a, int b) -> a - b;
		Calculo multiplicacao = (int a, int b) -> a * b;
		Calculo divisao = (int a, int b) -> a / b;
		
		System.out.println("1 + 2: " + soma.calcular(valor1, valor2));
		System.out.println("1 - 2: " + subtracao.calcular(valor1, valor2));
		System.out.println("1 * 2: " + multiplicacao.calcular(valor1, valor2));
		System.out.println("1 / 2: " + divisao.calcular(valor1, valor2));
		
	}

	interface Calculo {
		int calcular(int a, int b);
	}
	
	
}
