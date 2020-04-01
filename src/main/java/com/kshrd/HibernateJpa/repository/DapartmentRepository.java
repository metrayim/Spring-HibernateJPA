package com.kshrd.HibernateJpa.repository;

import com.kshrd.HibernateJpa.entities.Dapartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DapartmentRepository extends JpaRepository<Dapartment,Integer> {
}
