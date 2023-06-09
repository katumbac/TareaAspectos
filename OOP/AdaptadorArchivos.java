package OOP;

public class AdaptadorArchivos implements Archivo {
	private ArchivoAudio archivoAudio = new ArchivoAudio();

	@Override
	public void seleccionarArchivo() {
		archivoAudio.seleccionarArchivo();
		
	}

	@Override
	public void verArchivo() {
		archivoAudio.ColocarFondo();
		archivoAudio.reproducirArchivo();
		
	}

}
