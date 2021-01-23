package dao;

import java.io.IOException;

import model.User;

public interface UserDAOInterface {
	int signup(User user) throws ClassNotFoundException, IOException;
	boolean loginUser(User user) throws ClassNotFoundException, IOException;
}
