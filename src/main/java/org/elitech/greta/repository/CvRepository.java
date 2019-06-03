package org.elitech.greta.repository;

import org.elitech.greta.entites.Cv;
import org.elitech.greta.entites.TitrePoste;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestController
public interface CvRepository extends MongoRepository<Cv,String> {

    @RestResource(path = "/findAllCv")
    public List<Cv> findAll();

    @RestResource(path = "/findOneCv")
    public Cv findCvByIdCv(String idCv);

}
