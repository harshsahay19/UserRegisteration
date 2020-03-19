package com.harshsahay.registeration.dbc;

public class UserDatabase 
{
	
public int registerUser(UserRegisteration userRegisteration) throws ClassNotFoundException
{
	String INSERT_USERS_SQL = "INSERT INTO userRegisteration" + 
                                "(User_Id , User_First_Name ,User_Last_Name,User_Email,User_Password,User_Mobile,User_City) VALUES " +
                                "(?,?,?,?,?,?,?);";	
}
}
