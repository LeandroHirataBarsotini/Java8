import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalNull {

	public static void main(String[] args) {
		
		OptionalNull o = new OptionalNull();
		
		List<Carro> carros = o.gerarLista();
		
		carros.forEach(c -> {
			System.out.println(c.getNome());
			c.getMotor()
				.ifPresent(m -> System.out.println("\tserie do motor: " + m.getSerie()));
			
		});
		
		//carros.forEach(carro -> carro.getMotor().ifPresent(motor -> System.out.println(motor.getSerie())));
		
		//Optional<Integer> numero = Optional.of(null); // gera erro
		Optional<Integer> numero = Optional.of(1);
		
		System.out.println("o numero esta presente: " + numero.isPresent() + ", valor: " + numero.get());
		
	}
	
	public List<Carro> gerarLista() {
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		Carro carro;
		Optional<Motor> motor;
		
		carro = new Carro(); 
		carro.setNome("fucao");
		motor = Optional.of(new Motor());
		motor.get().setSerie("2017-01-06-m1");
		carro.setMotor(motor);
		carros.add(carro);
		
		carro = new Carro(); 
		carro.setNome("opala");
		motor = Optional.of(new Motor());
		motor.get().setSerie("2017-01-06-m2");
		carro.setMotor(motor);
		carros.add(carro);
		
		carro = new Carro(); 
		carro.setNome("kombosa");
		motor = Optional.of(new Motor());
		motor.get().setSerie("2017-01-06-m3");
		carro.setMotor(motor);
		carros.add(carro);
		
		carro = new Carro(); 
		carro.setNome("charrete");
		carros.add(carro);
		
		carro = new Carro(); 
		carro.setNome("carroça");
		carros.add(carro);
		
		return carros;
		
	}
	
	class Carro {
		
		private String nome;
		
		private Optional<Motor> motor = Optional.empty();
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Optional<Motor> getMotor() {
			return motor;
		}

		public void setMotor(Optional<Motor> motor) {
			this.motor = motor;
		}
		
	}
	
	class Motor {
		
		private String serie;

		public String getSerie() {
			return serie;
		}

		public void setSerie(String serie) {
			this.serie = serie;
		}
		
	}

}
