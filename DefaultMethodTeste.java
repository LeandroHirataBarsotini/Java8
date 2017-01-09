
public class DefaultMethodTeste {

	public static void main(String[] args) {
		
		DefaultMethodTeste dmt = new DefaultMethodTeste();
		dmt.test();

	}
	
	public void test() {
		
		Ferrari enzo = new Ferrari();
		enzo.print();
		
		VeiculoMaluco gambi = new VeiculoMaluco();
		gambi.print();
		
	}
	
	interface Moto {
		default void print() {
			System.out.println("Utilizo 2 rodas");
		}
	}
	
	interface Tricicolo {
		default void print() {
			System.out.println("Utilizo 3 rodas");
		}
	}

	interface Carro {
		default void print() {
			System.out.println("Utilizo 4 rodas");
		}
	}
	
	interface TremBala {
		default void print() {
			System.out.println("Flutuo, rs");
		}
	}
	
	interface Helicoptero {
		default void print() {
			System.out.println("Voo, rs");
		}
	}
	
	class Ferrari implements Carro {
		
	}
	
	class VeiculoMaluco implements Moto, Tricicolo, Carro, TremBala, Helicoptero {
		
		public void print() {
			Moto.super.print();
			Tricicolo.super.print();
			Carro.super.print();
			TremBala.super.print();
			Helicoptero.super.print();
		}
		
	}
	
}
