package co.edu.eafit.rasbus.dao.vehiculos;

import java.util.List;

import co.edu.eafit.rasbus.model.Vehiculo;

/**
 * Contrato de uso para acceder a la informacion de las Vehiculoes 
 * 
 * @author AORTIZU
 *
 */
public interface VehiculoDAO {
	/**
	 * Metodo encargado de crear una Vehiculo
	 * 
	 * @param Vehiculo informacion de la Vehiculo a guardar
	 * @return int identificador de la creación de la Vehiculo
	 */
	public int insertVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de eliminar una Vehiculo
	 * 
	 * @param Vehiculo informacion de la Vehiculo a eliminar
	 * @return boolean indica si se elimino correctamente la Vehiculo
	 */
	public boolean deleteVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de buscar una Vehiculo por el ID
	 * 
	 * @param idVehiculo identificador de la Vehiculo
	 * @return Vehiculo informacion de la Vehiculo encontrada
	 */
	public Vehiculo findVehiculo(int idVehiculo);

	/**
	 * Metodo encargado de actualizar la informacion de la Vehiculo
	 * 
	 * @param Vehiculo informacion de la Vehiculo a actualizar
	 * @return boolean indica si se actualizo correctamente la informacion
	 */
	public boolean updateVehiculo(Vehiculo Vehiculo);

	/**
	 * Metodo encargado de buscar todas las Vehiculoes almacenadas
	 * 
	 * @return List<Vehiculo> lista de Vehiculoes encontradas
	 */
	public List<Vehiculo> selectVehiculos();

	/**
	 * Metodo encargado de buscar las Vehiculoes de un conductor
	 * 
	 * @param idConductor identificador del conductor a buscar
	 * @return List<Vehiculo> lista de Vehiculoes encontradas
	 */
	public List<Vehiculo> findVehiculoByType(long idConductor);

}
