package com.Project1.Airline_Project;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	 Connection c;
	    Statement s;
	    
	    public Conn() {
	    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "root@360");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
	    }
}
