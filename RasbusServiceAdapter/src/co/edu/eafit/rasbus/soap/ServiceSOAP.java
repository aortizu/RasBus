

package co.edu.eafit.rasbus.soap;

import co.edu.eafit.rasbus.adapter.ServiceAdapter;


/**
 * Clase del aplicativo que cuenta con metodos afines a los de la clase
 * a adaptar, esta se comunica con la nueva clase mediante el patron adapter
 * @author chenao
 *
 */
public class ServiceSOAP extends ServiceAdapter {

    public ServiceSOAP(){
        super();
        System.out.println("Creando nuevo servicio SOAP");
    }

	public String recibirMensaje(String mensaje) {
		// TODO Auto-generated method stub
		 System.out.println("Se recibe el mensaje SOAP " + mensaje);
		return null;
	}


}
