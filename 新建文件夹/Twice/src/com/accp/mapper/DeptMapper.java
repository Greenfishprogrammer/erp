package com.accp.mapper;

import com.accp.pojo.Dept;
import com.accp.pojo.StockorderDetail;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(String tbDeptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(String tbDeptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}