package com.jiangjg.springstudy.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by root on 16-4-10.
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    //添加事务注解   x相当与对这个方法添加了事务   spring的声明师事务
    //事务的传播行为,当一个事务方法调用另外一个事务方法时，第一个方法已经在一个事务里面了, 那么第二个方法是否新开一个事务
    //REQUIRED: 如果有事务在运行，当前的方法就在这个事务内运行，否则就启动一个新事务，并在自己的事务内运行
    //REQUIRED_NEW: 当前的方法必须开启新事务，并在自己的事务内运行，如果有事务在运行，那么就将它挂起
    //事务的隔离级别
    //默认情况下对所有的运行时异常进行回滚，也可以通过对应的属性进行设置
    //使用readonly 指定事务是否只读，不更新数据，这样可以优化数据库引擎
    //Timeout = 1  指定强制回滚之前，事务可以占用的时间
    //@Transactional(propagation = Propagation.REQUIRED)  //指定事务的传播行为
    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED,
            noRollbackFor = {MyException.class})  //指定事务的传播行为
    public void changeName(String name, String toName){

        int sex = studentDao.getSexByName(name);

        studentDao.updateNameBySex(sex, toName);
    }

    @Transactional
    public void changeName2(String name, String toName){
        changeName("jjjjjj", "jjjjjj2");
        changeName("wwww", "wwww2");
    }
}
