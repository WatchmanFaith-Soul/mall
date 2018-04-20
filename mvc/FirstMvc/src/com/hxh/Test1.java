package com.hxh;

import com.hxh.dao.StudentDao;
import com.hxh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Test1 {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping("add")
    @ResponseBody
    public void addStudent(Student student){



        studentDao.add(student);
    }


    @RequestMapping("delete")
    @ResponseBody
    public void delete(Student student){


        studentDao.delete(student);
    }

    @RequestMapping("update")
    @ResponseBody
    public void update(Student student){

        studentDao.updata(student);

    }

    @RequestMapping("find")
    @ResponseBody

    public void find() {

        studentDao.findStudent(null);
    }
}
