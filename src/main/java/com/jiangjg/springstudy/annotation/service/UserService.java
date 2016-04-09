package com.jiangjg.springstudy.annotation.service;

import com.jiangjg.springstudy.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by root on 16-4-3.
 */

@Service
public class UserService {
    @Autowired
    /*
    当存在多个类型兼容的bean时，@Qualifier提供bean的名称
     */
    @Qualifier("userjdbcRepository")
    private UserRepository userRepository;

    public void add(){
        System.out.println("UserService add");
        userRepository.save();
    }

    public String getName(){
        return "UserService";
    }
}
