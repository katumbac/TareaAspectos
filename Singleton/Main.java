package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		
		MaquinaRegistro Jose = MaquinaRegistro.getInstance();

		Jose.registrarLlegada();
		
		MaquinaRegistro Maria = MaquinaRegistro.getInstance();
		
		System.out.println(Maria instanceof MaquinaRegistro);
		System.out.println(Jose.hashCode() == Maria.hashCode());

		
	}
}
