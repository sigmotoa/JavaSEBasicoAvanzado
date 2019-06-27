package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	
	/**
	 * Este metodo captura el tiempo de visualizacion
	 * 
	 *  @param dateI es un objeto de tipo date
	 *  @return Devuelve la fecha y hora capturada
	 */
	Date startToSee(Date dateI);
	
	/**
	 * Este metodo captura el tiempo exacto de inicio y fin de la visualizacion
	 * 
	 * @param dateI es un objeto de tipo {@code Date} con el tiempo de inicio exacto
	 * @param dateF es el tiempo final de visualizacion
	 * 
	 * 
	 * 
	 * */
	
	void stopToSee(Date dateI, Date dateF);
	
}
