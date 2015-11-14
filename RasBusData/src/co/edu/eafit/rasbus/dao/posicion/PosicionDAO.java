package co.edu.eafit.rasbus.dao.posicion;

import java.util.List;

import co.edu.eafit.rasbus.model.Posicion;

/**
 * Contrato de uso para el acceso a la informacion del Posicion
 * 
 * @author AORTIZU
 *
 */
public interface PosicionDAO {
	/**
	 * Metodo encargado de crear un Posicion
	 * 
	 * @param Posicion información del Posicion que se va a insertar
	 * @return int Numero identificador del insert
	 */
	public int insertPosicion(Posicion Posicion);

	/**
	 * Metodo encargado de eliminar un Posicion
	 * 
	 * @param Posicion informacion del Posicion que se va a eliminar
	 * @return boolean indica si se elimina satisfactoriamiente el Posicion
	 */
	public boolean deletePosicion(Posicion Posicion);

	/**
	 * Metodo encargado de encontrar un Posicion por su identificador
	 * 
	 * @param idPosicion identificar del Posicion a buscar
	 * @return Posicion informacion del Posicion que se estaba buscando
	 */
	public Posicion findPosicion(int idPosicion);

	/**
	 * Metodo encargado de actualizar la informacion del Posicion
	 * 
	 * @param Posicion informacion del Posicion que se desea actualziar 
	 * @return boolean indica si se actualizo correctamente la informacion del Posicion
	 */
	public boolean updatePosicion(Posicion Posicion);

	/**
	 * Metodo encargado de buscar la lista de todos los Posiciones
	 * 
	 * @return List<Posicion> lista de Posicion
	 */
	public List<Posicion> selectPosiciones();
	
	/**
	 * Metodo encargado de buscar un Posicion por su perfil, clave y nombre de Posicion
	 * 
	 * @param Posicion Posicion que se esta buscando en
	 * @return Posicion informacion del Posicion que se estaba buscando
	 */
	public List <Posicion> findPosicionByVehiculo(String placa);
}
