package main;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UserDao;
import dto.Users;

public class TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		DisplayMenu display = new DisplayMenu();
		display.showMenuOptions();
	}

}
