package co.edu.eafit.rasbus.adapter;

import java.io.IOException;

/**
 * Clase abstracta patron Adapter
 *  
 * @author evalero
 *
 */
public abstract class ServiceAdapter {
	public abstract void recibirMensaje(String message) throws IOException;
}
