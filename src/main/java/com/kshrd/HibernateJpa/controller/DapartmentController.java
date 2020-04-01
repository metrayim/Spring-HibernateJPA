package com.kshrd.HibernateJpa.controller;

import com.kshrd.HibernateJpa.entities.Dapartment;
import com.kshrd.HibernateJpa.service.DapartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/department")
public class DapartmentController {

    private DapartmentService dapartmentService;

    public DapartmentController(DapartmentService dapartmentService) {
        this.dapartmentService = dapartmentService;
    }

    @PostMapping("")
    public ResponseEntity<Dapartment> saveDapartment(@RequestBody Dapartment dapartment){
        Dapartment dapartment1= this.dapartmentService.SaveDapartment(dapartment);
        return ResponseEntity.ok(dapartment1);
    }

    @PutMapping("")
    public ResponseEntity<Dapartment> updateDapartment(@RequestBody  Dapartment dapartment){
        Dapartment dapartment1=this.dapartmentService.UpdateDapartment(dapartment);
        return  ResponseEntity.ok(dapartment1);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Map<String,Object>> getOne(@PathVariable("id") Integer id){
        Dapartment dapartment1=this.dapartmentService.getOne(id);
        Map<String,Object> respone=new HashMap<>();
        respone.put("data",dapartment1);
        respone.put("message","OK for get data");

        return  ResponseEntity.ok(respone);
    }
    @GetMapping("get/")
    public ResponseEntity<Map<String,Object>> getAllDapartment(){
        List<Dapartment> response= this.dapartmentService.findAll();
        Map<String,Object> map=new HashMap<>();
        map.put("data",response);
        map.put("message","OK for getall");
        System.out.println(response);
        return ResponseEntity.ok(map);
    }
    @PostMapping("allDapartment/")
    public ResponseEntity<Map<String,Object>> insertAllDapartment(List<Dapartment> dapartments){
        Map<String,Object> respone=new HashMap<>();
        List<Dapartment> dapartments1=this.dapartmentService.saveBatch(dapartments);
        respone.put("data",dapartments);
        respone.put("message","OK for insert");

        return ResponseEntity.ok(respone);
    }

}
