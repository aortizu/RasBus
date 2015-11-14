package co.edu.eafit.rasbus.dao.vehiculos;

import java.util.List;

import co.edu.eafit.rasbus.model.Vehiculo;

/**
 *  Acceso a la informacion de vehiculos
 * 
 * @author AORTIZU
 *
 */
public interface VehiculoDAO {
	/**
	 * Metodo encargado de crear un Vehiculo
	 * 
	 * @param Vehiculo informacion del Vehiculo a guardar
	 * @return int identificador de la creación del Vehiculo
	 */
	public int insertVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de eliminar un Vehiculo
	 * 
	 * @param Vehiculo informacion del Vehiculo a eliminar
	 * @return boolean indica si se elimino correctamente el Vehiculo
	 */
	public boolean deleteVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de buscar un Vehiculo por placa
	 * 
	 * @param idVehiculo identificador del Vehiculo
	 * @return Vehiculo informacion del Vehiculo encontrada
	 */
	public Vehiculo findVehiculo(int idVehiculo);

	/**
	 * Metodo encargado de actualizar la informacion del Vehiculo
	 * 
	 * @param Vehiculo informacion del Vehiculo a actualizar
	 * @return boolean indica si se actualizo correctamente la informacion
	 */
	public boolean updateVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de buscar todos los Vehiculos almacenados
	 * 
	 * @return List<Vehiculo> lista de Vehiculos encontradas
	 */
	public List<Vehiculo> selectVehiculos();

	/**
	 * Metodo encargado de buscar los Vehiculos de un conductor
	 * 
	 * @param idConductor identificador del conductor a buscar
	 * @return List<Vehiculo> lista de Vehiculos encontradas
	 */
	public List<Vehiculo> findVehiculoByType(long idConductor);

}
