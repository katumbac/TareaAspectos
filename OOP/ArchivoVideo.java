package OOP;
public class ArchivoVideo implements Archivo {

	@Override
	public void seleccionarArchivo() {
		System.out.println("Archivo Seleccionado");
		
	}

	@Override
	public void verArchivo() {
		System.out.println("Reproduciendo Video");
		
	}
	
}
