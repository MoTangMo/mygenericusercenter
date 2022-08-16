package com.example.usercenter.repository;

import com.example.usercenter.entity.CenterUserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;


public  interface userRepository extends Repository<CenterUserEntity, Long> {

    long countByPhonenumber(String phoneNumber);

    CenterUserEntity save(CenterUserEntity entity);

    CenterUserEntity getByPhonenumber(String phoneNumber);
}
