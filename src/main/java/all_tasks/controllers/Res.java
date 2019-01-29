package all_tasks.controllers;

import all_tasks.entity.Main;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;

@Controller
public class Res {
    @Autowired
    EntityManager manager;

    @GetMapping("/user?name=asdf")
    public ResponseEntity get(@RequestParam String s) throws NoSuchMethodException {
      String ra[] = Array [10];
      ra.length
        manager.createQuery("select from Main where id=:id")
                .setParameter("id", s);

        return ResponseEntity.ok().build();
    }

}
