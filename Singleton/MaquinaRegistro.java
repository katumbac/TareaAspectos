package Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class MaquinaRegistro {
	
	private static MaquinaRegistro instance;
	
	private MaquinaRegistro() {
		instance = this;
    }
    
	public static MaquinaRegistro getInstance() {

        return instance;
    }
	
	public static void registrarLlegada() {
		
		System.out.println("Registrando llegada");
		
	}
	
	public static void registarSalida() {
		
		System.out.println("Registrando salida");

	}

}
