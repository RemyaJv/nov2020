package com.hexaware.MLP262.persistance;

import org.skife.jdbi.v2.DBI;

/**
 */
public class DbConnection {
    /**
     * Connecting to MYSQL DB.
     * @return database Connection.
     */
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLP262", 
        "root", "Password123");
      System.out.println("Connected...!!!");
      return dbi;
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
} 
