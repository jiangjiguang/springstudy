package com.jiangjg.springstudy.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by root on 16-4-3.
 */
@Repository
public class UserjdbcRepository implements UserRepository {
    public void save() {
        System.out.println("UserjdbcRepository save");
    }
}
