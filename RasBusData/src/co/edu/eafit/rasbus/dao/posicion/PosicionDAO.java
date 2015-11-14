package co.edu.eafit.rasbus.dao.posicion;

import java.util.List;

import co.edu.eafit.rasbus.model.Posicion;

/**
 * Acceso a la informacion de posicion
 * 
 * @author AORTIZU
 *
 */
public interface PosicionDAO {
	/**
	 * Metodo encargado de crear una Posicion
	 * 
	 * @param Posicion información de la Posicion que se va a insertar
	 * @return int Numero identificador del insert
	 */
	public int insertPosicion(Posicion Posicion);

	/**
	 * Metodo encargado de eliminar un Posicion
	 * 
	 * @param Posicion informacion de la Posicion que se va a eliminar
	 * @return boolean indica si se elimina satisfactoriamiente la Posicion
	 */
	public boolean deletePosicion(Posicion Posicion);

	/**
	 * Metodo encargado de encontrar un Posicion por su identificador
	 * 
	 * @param idPosicion identificar de la Posicion a buscar
	 * @return Posicion informacion de la Posicion que se estaba buscando
	 */
	public Posicion findPosicion(int idPosicion);

	/**
	 * Metodo encargado de actualizar la informacion del Posicion
	 * 
	 * @param Posicion informacion de la Posicion que se desea actualzar 
	 * @return boolean indica si se actualizo correctamente la informacion de la Posicion
	 */
	public boolean updatePosicion(Posicion Posicion);

	/**
	 * Metodo encargado de buscar la lista de todos los Posiciones
	 * 
	 * @return List<Posicion> lista de Posicion
	 */
	public List<Posicion> selectPosiciones();
	
	/**
	 * Metodo encargado de buscar un Posicion por su placa de vehiculo
	 * 
	 * @param String placa de vehiculo
	 * @return List informacion de la Posicion
	 */
	public List <Posicion> findPosicionByVehiculo(String placa);
}
