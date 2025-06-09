<<<<<<< HEAD
package com.pcwk.ehr.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	/**
	 * DB 연결
	 * 
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	Connection makeConnection() throws ClassNotFoundException, SQLException;

=======
package com.pcwk.ehr.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	/**
	 * DB 연결
	 * 
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	Connection makeConnection() throws ClassNotFoundException, SQLException;

>>>>>>> 646959ed7a43ecc48dacf66ac75af191cb9c615f
}