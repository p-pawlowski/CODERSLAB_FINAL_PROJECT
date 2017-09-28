package p.p.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import p.p.entity.Role;
import p.p.entity.User;
import p.p.repository.RoleRepository;
import p.p.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		Role userRole = roleRepository.findByRole("USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		
	}


	@Override
	public List<User> findAllUsers() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public void deleteUser(int id) {
		User user = findUser(id);
		userRepository.delete(user);
		
	}

	@Override
	public User findUser(int id) {
		User user = userRepository.findById(id);
		return user;
	}
}