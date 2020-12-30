package com.accp.dao;

import com.accp.pojo.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    
    void show1();
    
    void show2();
}