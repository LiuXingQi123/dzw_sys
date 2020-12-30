package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Person;

public interface PersonMapper {
	
	@Select("select * from tbl_person")
	List<Person> queryAll();
	
    int deleteByPrimaryKey(Integer pid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKeyWithBLOBs(Person record);

    int updateByPrimaryKey(Person record);
}