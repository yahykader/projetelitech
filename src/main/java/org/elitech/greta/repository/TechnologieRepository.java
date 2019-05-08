package org.elitech.greta.repository;

import org.elitech.greta.entites.Technologie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestController
public interface TechnologieRepository extends MongoRepository<Technologie,String> {

}
