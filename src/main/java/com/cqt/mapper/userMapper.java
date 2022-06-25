package com.cqt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userMapper {

   /* @Insert("insert into test.user values(3,'lisi')")
    void insertOne();*/
    @Select("select * from reportdb.user")
    void getUser();
}
