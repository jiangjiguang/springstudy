package com.jiangjg.springstudy.transaction;

/**
 * Created by root on 16-4-10.
 */
public interface StudentDao {
    int getSexByName(String name);

    void updateNameBySex(int sex, String name);

}
