/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mybatis02.controller;

import com.example.mybatis02.model.Actor;
import com.example.mybatis02.service.ActorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BRITNEY
 */
@RestController
@RequestMapping("/actor")
public class ActorRestController {
    
    @Autowired
    private ActorService actorService;
    
    @GetMapping("/all")
    public List<Actor> getActors(){
        return actorService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable int id){
        Actor actor = actorService.findById(id);
        return ResponseEntity.ok(actor);
    }
    
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {        
        actorService.deleteById(id);
    }
    @PostMapping("/add")
    public int addPost(@RequestBody Actor actor) {  
        return actorService.insert(actor);
    }
    @PutMapping("/edit")
    public int editPost(@RequestBody Actor actor) {  
        Actor act = new Actor(actor.getIdactor(),actor.getNombre(),actor.getApellido(), actor.getCorreo());
        return actorService.update(actor);
    }
}
