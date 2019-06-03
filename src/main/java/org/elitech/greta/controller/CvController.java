package org.elitech.greta.controller;

import org.elitech.greta.entites.Cv;
import org.elitech.greta.repository.CvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@RestController
public class CvController {

    @Autowired
   private  CvRepository cvRepository;

    @GetMapping("/findAllCvs")
    public List<Cv> findAllCvs(){

        return cvRepository.findAll();
    }





}
