package OOP;

public class MainPrueba {
	public static void main(String args[]) {
		Usuario us1 = new Usuario();
		System.out.println("Archivo de video");
		us1.visualizarArchivo(new ArchivoVideo());
		System.out.println("");
		System.out.println("Archivo de Audio");
		us1.visualizarArchivo(new AdaptadorArchivos());
	}
}
