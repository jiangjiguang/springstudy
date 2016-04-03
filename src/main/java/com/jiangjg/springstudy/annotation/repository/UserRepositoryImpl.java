package com.jiangjg.springstudy.annotation.repository;

import com.jiangjg.springstudy.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 16-4-3.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    public void save() {
        System.out.println("UserRepositoryImpl save");
        System.out.println(testObject);
    }
}
