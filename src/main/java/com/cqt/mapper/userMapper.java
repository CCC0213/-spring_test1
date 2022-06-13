package com.cqt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {

    @Insert("insert into test.user values(2,'zhangsan1')")
    void insertOne();

}
