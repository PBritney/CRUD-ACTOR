/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.mybatis02.service;

import com.example.mybatis02.model.Actor;
import java.util.List;

/**
 *
 * @author BRITNEY
 */
public interface ActorService {
    
    public List<Actor> findAll();
    public Actor findById(long id);
    public int deleteById(long id);
    public int insert(Actor actor);
    public int update(Actor actor);

}