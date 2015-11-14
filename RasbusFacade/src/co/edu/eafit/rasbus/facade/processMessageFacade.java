package co.edu.eafit.rasbus.facade;

import co.edu.eafit.rasbus.dao.factory.DAOFactory;
import co.edu.eafit.rasbus.dao.factory.OracleDAOFactory;


public class processMessageFacade {
	
	private static final processMessageFacade INSTANCE = new processMessageFacade();

	DAOFactory dao = new DAOFactory ();
	
	
	private processMessageFacade getInstance(){
		return INSTANCE;
	}

	




	public void guardarInformacionMensaje(){
	}
}