

package co.edu.eafit.rasbus.soap;

import java.io.IOException;

import co.edu.eafit.rasbus.adapter.ServiceAdapter;
import co.edu.eafit.rasbus.facade.ProcessMessageFacade;


/**
 * Clase que recibe la informacion del servicio soap
 *
 */
public class ServiceSOAP extends ServiceAdapter {

    public ServiceSOAP(){
        super();
        System.out.println("Creando nuevo servicio SOAP");
    }


    /**
     * Se invoca la fachada
     *
     */
	public void recibirMensaje(String message) throws IOException {
		System.out.println("Se recibe el mensaje REST " + message);
		ProcessMessageFacade facade = new ProcessMessageFacade();
		facade.messageValidator(2, message);
	}


}
