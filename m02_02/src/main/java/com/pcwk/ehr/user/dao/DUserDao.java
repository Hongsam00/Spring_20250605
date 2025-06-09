<<<<<<< HEAD
package com.pcwk.ehr.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1.
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2.
		String url = "jdbc:oracle:thin:@192.168.100.30:1522:XE";
		String user = "scott";
		String password = "pcwk";
		conn = DriverManager.getConnection(url, user, password);

		System.out.println("1.conn:" + conn);

		return conn;
	}

}
=======
package com.pcwk.ehr.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1.
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2.
		String url = "jdbc:oracle:thin:@192.168.100.30:1522:XE";
		String user = "scott";
		String password = "pcwk";
		conn = DriverManager.getConnection(url, user, password);

		System.out.println("1.conn:" + conn);

		return conn;
	}

}
>>>>>>> 646959ed7a43ecc48dacf66ac75af191cb9c615f
