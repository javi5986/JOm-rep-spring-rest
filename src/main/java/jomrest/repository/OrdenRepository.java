package jomrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jomrest.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
