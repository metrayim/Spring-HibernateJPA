package com.kshrd.HibernateJpa.service;

import com.kshrd.HibernateJpa.entities.Dapartment;
import com.kshrd.HibernateJpa.repository.DapartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DapartmentService {
    private DapartmentRepository dapartmentRepository;

    public DapartmentService(DapartmentRepository dapartmentRepository) {
        this.dapartmentRepository = dapartmentRepository;
    }

    public Dapartment SaveDapartment(Dapartment dapartment){
      return this.dapartmentRepository.save(dapartment);
    }
    public Dapartment UpdateDapartment(Dapartment dapartment){
        Dapartment dapartment1=this.dapartmentRepository.getOne(dapartment.getId());
        dapartment1.setName(dapartment.getName());
        return this.dapartmentRepository.save(dapartment1);
    }
    public void deleteDapartment(Integer id){
        this.dapartmentRepository.deleteById(id);
    }
    public Dapartment getOne(Integer id){
       return this.dapartmentRepository.getOne(id);
    }
    public List<Dapartment> findAll(){
        return this.dapartmentRepository.findAll();
    }
    public List<Dapartment> saveBatch(List<Dapartment> dapartments){
        return  this.dapartmentRepository.saveAll(dapartments);
    }
}
