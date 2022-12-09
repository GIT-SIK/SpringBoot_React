package dev.scheincomp.mybatis.controller;

import dev.scheincomp.mybatis.dao.IndexDao;
import dev.scheincomp.mybatis.vo.IndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {


    @Autowired
    private IndexDao indexDao;



    @GetMapping ("/api/data")
    @ResponseBody
    public List<IndexEntity> IndexValue(){
        List<IndexEntity> listIndex = indexDao.listIndex();
        System.out.println(Arrays.asList(listIndex));
        return listIndex;
    }

    @GetMapping ("/api/indexDelete")
    @ResponseBody
    public void IndexDelete(){
        indexDao.listDelete(1);
    }
}
