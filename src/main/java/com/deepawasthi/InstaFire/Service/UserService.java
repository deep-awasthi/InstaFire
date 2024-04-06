package com.deepawasthi.InstaFire.Service;

import com.deepawasthi.InstaFire.Entity.UserEntity;
import com.deepawasthi.InstaFire.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity createUser(UserEntity user){
        return userRepository.save(user);
    }

    public UserEntity getUserDetail(int userId){
        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("No User Found"));
    }
}
