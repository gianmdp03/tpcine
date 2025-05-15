package com.trabajo.cine.Trabajo_Cine.repository;
import com.trabajo.cine.Trabajo_Cine.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

}
