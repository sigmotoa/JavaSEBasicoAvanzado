package com.sigmotoa.amazonviewer.db;

public class DataBase {
//Datos de la conexion a la DB
	public static final String URL = "jdbc:mysql://localhost:3300/";
	public static final String DB = "amazonviewer";
	public static final String USER = "amazonviewer";
	public static final String PASSWORD = "amazonviewer";
	
//Mapeando la tabla MOVIE
	public static final String TMOVIE = "movie";
	public static final String TMOVIE_ID = "id";
	public static final String TMOVIE_TITLE = "title";
	public static final String TMOVIE_GENRE = "genre";
	public static final String TMOVIE_CREATOR = "creator";
	public static final String TMOVIE_DURATION = "duration";
	public static final String TMOVIE_YEAR = "year";
	
	//Mapeando la tabla MATERIAL
	
	public static final String TMATERIAL ="material";
	public static final int [] TMATERIAL_ID = {1,2,3,4,5};
	
	
	//Mapeando la tabla USER
	
	public static final String TUSER ="user";
	public static final int TUSER_ID =2;
	
	
	//Mapeando la tabla VIEWED
	
	public static final String TVIEWED ="viewed";
	
	public static final String TVIEWED_ID_ELEMENT ="id_element";
	public static final String TVIEWED_ID_MATERIAL ="id_material";
	public static final String TVIEWED_ID_USER ="id_user";
	
	
	
	
	
	
	
	

}
