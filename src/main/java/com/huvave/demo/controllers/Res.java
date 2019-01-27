package com.huvave.demo.controllers;

import com.huvave.demo.entity.Main;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import java.sql.ResultSet;

@Controller
public class Res {
@Autowired
    EntityManager manager;

    @GetMapping("/user?name=asdf")
    public ResponseEntity get(@RequestParam String s) throws NoSuchMethodException {
        manager.createQuery("select from Main where id=:id")
                .setParameter("id", s);

        queryFactory.selectFrom(Main)
                .where(Main.id.eq(s)
                .fetch();

        ( Main.class,
        Restrictions.eq("id", s)).;
        ResultSet resoultSet

        return ResponseEntity.ok().build();
    }

}
