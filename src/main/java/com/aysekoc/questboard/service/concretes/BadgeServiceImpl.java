package com.aysekoc.questboard.service.concretes;

import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.repository.BadgeRepository;
import com.aysekoc.questboard.service.abstracts.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeServiceImpl implements BadgeService {

    private BadgeRepository badgeRepository;

    @Override
    public List<User> listAll() {
        return List.of();
    }
}
