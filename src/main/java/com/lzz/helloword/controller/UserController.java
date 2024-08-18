package com.lzz.helloword.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<String> getUsers() {
        List<String> Arrays;
        Reader reader = null;
        reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        Arrays = session.selectOne("com.lzz.helloword.DAO", 1);
        System.out.println(Arrays);
        session.close();


        return Arrays;
    }
}