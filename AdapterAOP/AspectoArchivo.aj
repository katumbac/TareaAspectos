package AdapterAOP;

public aspect AspectoArchivo {
	public pointcut adaptadorArchivoAudio(): initialization(public ArchivoAudio.new());
	before(): adaptadorArchivoAudio(){
		System.out.println("Colocando un fondo al audio");
		System.out.println("Reproduciendo Audio");
		
	}
	public pointcut adaptadorArchivoVideo(): initialization(public ArchivoVideo.new());
	before(): adaptadorArchivoVideo(){
		System.out.println("Reproduciendo Video");

	}
}
