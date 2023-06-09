package Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

privileged public aspect Auditoria {
	
	pointcut auditoriaRegistro(): execution(MaquinaRegistro MaquinaRegistro.getInstance());
	MaquinaRegistro around(): auditoriaRegistro(){
		MaquinaRegistro registro = MaquinaRegistro.instance;
		if(registro == null) {
			registro = new MaquinaRegistro();
		}
		return registro;
	}

}
