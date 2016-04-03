package com.jiangjg.springstudy.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 16-4-3.
 */
@Service
public class BaseService<T> {
    /*
    繁行以来注入
     */
    @Autowired
    private BaseRepository<T> baseRepository;

    public void add(){
        System.out.println("add");
        System.out.println(baseRepository);
    }

}
