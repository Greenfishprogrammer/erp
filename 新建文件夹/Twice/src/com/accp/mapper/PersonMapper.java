package com.accp.mapper;

import com.accp.pojo.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(String tbPersonno);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(String tbPersonno);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}