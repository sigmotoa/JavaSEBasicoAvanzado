package com.sigmotoa.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.sigmotoa.amazonviewer.db.DataBase.*;

public interface IDBConnectioni {
	
	default Connection connectToDB()
	{
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if(connection!=null) {
				System.out.println("Logramos conectar  :) ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			return connection;
		}
	}

}
