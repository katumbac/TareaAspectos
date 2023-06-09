package AOP;

public class ArchivoAudio implements Archivo {
	@Override
	public void seleccionarArchivo() {
		System.out.println("Archivo Seleccionado");
	}
	public void ColocarFondo() {
		System.out.println("Colocando un fondo al audio");
	}
}
