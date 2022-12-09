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

    /* Index Delete -> 지정값 Num값 삭제 / 성공여부 리턴없음 */
    @GetMapping ("/api/indexDelete")
    @ResponseBody
    public void IndexDelete(){
        int tempListNum = 8;
        int temp = indexDao.listDelete(tempListNum);
        if(temp == 1){
            System.out.println( tempListNum + " 값 삭제성공");

        }
        else {
            System.out.println( tempListNum + " 값 삭제실패");
        }
    }

    /* Index Insert -> Num은 (자동) 숫자 / 날짜는 (자동) 오늘날짜 */
    @GetMapping ("/api/indexInsert")
    @ResponseBody
    public void IndexInsert(){

        IndexEntity ie = new IndexEntity();
        ie.setHide_1(false);
        ie.setHide_2(false);
        ie.setHide_3(false);
        ie.setData_1("NumberT");


        indexDao.listInsert(ie);
    }

    @GetMapping("/api/indexUpdate")
    @ResponseBody
    public void IndexUpdate(){
        indexDao.listUpdate(4, "ReNum");
    }

}
