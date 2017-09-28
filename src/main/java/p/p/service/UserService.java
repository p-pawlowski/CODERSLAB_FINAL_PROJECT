package p.p.service;

import java.util.List;

import p.p.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public User findUser(int id);
	public List<User> findAllUsers();
	public void saveUser(User user);
	public void deleteUser(int id);

}
