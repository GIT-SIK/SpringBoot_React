package dev.scheincomp.mybatis.dao;

import dev.scheincomp.mybatis.vo.SubEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubDao {

    public SubEntity subEntity();
}
