package p.p.service;

import p.p.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);

}
