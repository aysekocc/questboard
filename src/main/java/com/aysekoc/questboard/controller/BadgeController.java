package com.aysekoc.questboard.controller;


import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.service.abstracts.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/badge")
public class BadgeController {

    private BadgeService badgeService;

    @GetMapping("/listAll")
    public List<User> listAll(){
        return null;
    }
}
