package com.kevco.time.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import com.kevco.time.model.User;
import com.kevco.time.repo.UserRepository;

@Controller("userController")
public class UserController implements UserRepository{
	@Autowired
	private UserRepository userRepo;
	
	public boolean login(String email , String password){
		try{
			User foundEm = userRepo.findByEmail(email);
			if(foundEm != null){
				if(foundEm.getPassword().equals(password)){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
		}
	}
	
	public boolean setPass(String email, String password){
		User foundEm = userRepo.findByEmail(email);
		if(foundEm != null){
			foundEm.setPassword(password);
			userRepo.save(foundEm);
			return true;
		}else{
			return false;
		}
	}

	@Override
	public <S extends User> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		userRepo.deleteAll();
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S arg0) {
		return userRepo.save(arg0);
	}

	@Override
	public List<User> findByLastName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
}
