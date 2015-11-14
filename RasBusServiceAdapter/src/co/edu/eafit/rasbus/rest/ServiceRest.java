

package co.edu.eafit.rasbus.rest;

import java.io.IOException;

import co.edu.eafit.rasbus.adapter.ServiceAdapter;
import co.edu.eafit.rasbus.facade.ProcessMessageFacade;


/**
 * Clase que recibe la informacion del servicio rest
 *
 */
public class ServiceRest extends ServiceAdapter {

    public ServiceRest(){
        super();
        System.out.println("Creando nuevo servicio REST");
    }

    /**
     * Se invoca la fachada
     *
     */
	public void recibirMensaje(String message) throws IOException {
		System.out.println("Se recibe el mensaje REST " + message);
		ProcessMessageFacade facade = new ProcessMessageFacade();
		facade.messageValidator(1, message);
	}

}
