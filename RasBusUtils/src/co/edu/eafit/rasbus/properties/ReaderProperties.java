package co.edu.eafit.rasbus.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
/**
 * Clase relacionada con procesamientos de archivo de propiedades
 * 
 * @author dospina9
 *
 */
public class ReaderProperties {
	String result = "";
	InputStream inputStream;
 
	
	/**
	 * Metodo que obtiene el tipo de conexion de base de datos a usar 
	 * 
	 */
	public String getPropValues(String propertie) throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("Error leyendo el archivo '" + propFileName );
			}
 
			result = prop.getProperty(propertie);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
