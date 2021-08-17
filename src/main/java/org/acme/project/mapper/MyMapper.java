package org.acme.project.mapper;

import org.acme.project.entity.MyEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyMapper
{
    MyEntity select();
}
