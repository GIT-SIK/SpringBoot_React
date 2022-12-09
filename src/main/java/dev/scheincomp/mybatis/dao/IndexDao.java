package dev.scheincomp.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import dev.scheincomp.mybatis.vo.*;

import java.util.List;


@Mapper
public interface IndexDao {
    public IndexEntity indexEntity();

    /* Entity -> List<Entity> */
    public List<IndexEntity> listIndex();

    public int listDelete(int num);
    public int listInsert(IndexEntity ie);

    public int listUpdate(int num, String data_1);
}
