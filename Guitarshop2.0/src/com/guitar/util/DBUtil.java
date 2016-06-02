package com.guitar.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static Properties pros = new Properties();
	private static String driver;
	private static String url;
	//读取配置文件
	static { // 静态代码块，只加载一次
		try {
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = pros.getProperty("driver");
		url = pros.getProperty("url");
	}
	
	public static Connection open() {
		try {
			Class.forName(driver);
			try {
				return DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection Conn) {
		if (Conn != null) {
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
