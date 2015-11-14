

package co.edu.eafit.rasbus.socket;

import java.io.IOException;

import co.edu.eafit.rasbus.adapter.ServiceAdapter;
import co.edu.eafit.rasbus.facade.ProcessMessageFacade;


/**
 * Clase que recibe la informacion del servicio socket
 *
 */
public class ServiceSocket extends ServiceAdapter {

    public ServiceSocket(){
        super();
        System.out.println("Creando nuevo servicio SOCKET");
    }


    /**
     * Se invoca la fachada
     *
     */
	public void recibirMensaje(String message) throws IOException {
		System.out.println("Se recibe el mensaje REST " + message);
		ProcessMessageFacade facade = new ProcessMessageFacade();
		facade.messageValidator(3, message);
	}


}
