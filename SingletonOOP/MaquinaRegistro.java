package SingletonOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class MaquinaRegistro {


		private static MaquinaRegistro instance = null;
		
		private MaquinaRegistro() {
	    }
	    
		public static MaquinaRegistro getInstance() {
	        if (instance == null) {
	            instance = new MaquinaRegistro();
	        }
	        return instance;
	    }
		
		public static void registrarLlegada() {
			
			try {
				FileWriter file = new FileWriter("Llegada.txt",true);
				Calendar cal = Calendar.getInstance();
				
				file.write("Llegada: " +  cal.getTime() + "\n");
				file.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
		}
		
		public static void registarSalida() {
			
			try {
				FileWriter file = new FileWriter("Salida.txt",true);
				Calendar cal = Calendar.getInstance();
				
				file.write("Salida: " +  cal.getTime() + "\n");
				file.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}

}
