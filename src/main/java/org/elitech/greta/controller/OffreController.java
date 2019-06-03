package org.elitech.greta.controller;

import org.elitech.greta.entites.Cv;
import org.elitech.greta.entites.Offre;
import org.elitech.greta.entites.TitrePoste;
import org.elitech.greta.repository.CvRepository;
import org.elitech.greta.repository.OffreRepository;
import org.elitech.greta.repository.TitrePosteRepository;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@RestController
public class OffreController {

    @Autowired
    private  OffreRepository offreRepository;

    @Autowired
    private CvRepository cvRepository;

    @Autowired
    private TitrePosteRepository titrePosteRepository;

    @GetMapping("/findAllOffres")
    public List<Offre> findAllOffres(){

        return offreRepository.findAll();
    }
    @DeleteMapping("/deleteOffre")
    public  void deleteOffre(Offre off){
          offreRepository.delete(off);
    }

    @PostMapping("/savePoste")
    public TitrePoste savePostes(@RequestBody TitrePoste titres, String nomPoste, String idOffre,  String idCv ){

        Offre F1=offreRepository.findById(idOffre).get();
        Cv C1=cvRepository.findById(idCv).get();

        TitrePoste titrePoste= titrePosteRepository.save(new TitrePoste(null,"nomPoste",F1,C1));
        return titrePoste;
    }

}
