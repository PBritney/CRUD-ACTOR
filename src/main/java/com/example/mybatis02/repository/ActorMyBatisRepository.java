/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.mybatis02.repository;

import com.example.mybatis02.model.Actor;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author BRITNEY
 */
@Mapper
public interface ActorMyBatisRepository {
    @Insert("INSERT INTO actor(nombre,apellido,correo) VALUES (#{nombre},#{apellido},#{correo})")
    public int insert(Actor actor);
    
    @Insert("UPDATE actor SET nombre=#{nombre}, apellido=#{apellido},correo=#{correo} WHERE idactor=#{idactor}")
    public int update(Actor actor);
    
    @Delete("DELETE FROM actor WHERE idactor=#{id}")
    public int delete(long id);
    
    @Select("SELECT *FROM actor WHERE idactor=#{id}")
    public Actor findById(long id);
    
    @Select("SELECT *FROM actor")
    public List<Actor> findAll();
    
}
