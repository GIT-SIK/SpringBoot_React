package dev.scheincomp.mybatis.controller;

import dev.scheincomp.mybatis.dao.IndexDao;
import dev.scheincomp.mybatis.vo.IndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class IndexController {


    @Autowired
    private IndexDao indexDao;


    @GetMapping ("/api/data")
    public String MybatisValue(){
      List<IndexEntity> listIndex = indexDao.listIndex();
      System.out.println(Arrays.asList(listIndex));
      return listIndex.get(0).getDate_1() + "";
    }

}
