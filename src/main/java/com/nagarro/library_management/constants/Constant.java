package com.nagarro.library_management.constants;

public class Constant {
	public static final String HIBERNATE_USERNAME="root";
	public static final String HIBERNATE_PASSWORD="12345678";
	public static final String HIBERNATE_DIALECT="org.hibernate.dialect.MySQLDialect";
	public static final String HIBERNATE_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String HIBERNATE_URL="jdbc:mysql://librarymanagedb.cwce9lirrjyp.ap-south-1.rds.amazonaws.com:3306/library_login";
	public static final String HIBERNATE_HBM2DDL_AUTO="update";
	public static final String HIBERNATE_SHOW_SQL="false";
	public static final String BOOK_API = "http://localhost:8082/api/books";
	public static final String AUTHOR_API = "http://localhost:8082/api/authors";
}
