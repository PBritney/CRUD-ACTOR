/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mybatis02.serviceImpl;

import com.example.mybatis02.model.Actor;
import com.example.mybatis02.repository.ActorMyBatisRepository;
import com.example.mybatis02.service.ActorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BRITNEY
 */
@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMyBatisRepository actorMyBatisRepository;
   @Override
    public List<Actor> findAll() {
        return actorMyBatisRepository.findAll();
    }

    @Override
    public Actor findById(long id) {
        return actorMyBatisRepository.findById(id);
    }

    @Override
    public int deleteById(long id) {
        return actorMyBatisRepository.delete(id);
    }

    @Override
    public int insert(Actor actor) {
        return actorMyBatisRepository.insert(actor);
    }

    @Override
    public int update(Actor actor) {
        return actorMyBatisRepository.update(actor);
    }
    
    
}
