package com.praveen.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.praveen.domain.UserDetails;
import com.praveen.entity.UserDetailsEntity;
import com.praveen.repository.UserDetailsRepository;

@Component
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDetailsRepository userDtlsRepo;


	@Override
	public UserDetailsEntity saveUserDetails(UserDetails userDetails) {
		

		UserDetailsEntity entity = new UserDetailsEntity();
		
		BeanUtils.copyProperties(userDetails, entity);
		
		String lock="Locked";
		 entity.setLockStatus(lock);
		 String role="Admin";
		 entity.setUserRole(role);
		 entity.setUserPWD(RandomStringUtils.randomAlphabetic(10));
		
		
		return userDtlsRepo.save(entity);
 
	}

}
