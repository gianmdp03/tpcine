package com.trabajo.cine.Trabajo_Cine.repository;
import com.trabajo.cine.Trabajo_Cine.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
