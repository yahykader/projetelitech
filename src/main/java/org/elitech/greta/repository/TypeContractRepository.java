package org.elitech.greta.repository;

import org.elitech.greta.entites.TypeContract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestController
public interface TypeContractRepository extends MongoRepository<TypeContract,String> {
}
