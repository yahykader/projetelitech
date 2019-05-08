package org.elitech.greta.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data @AllArgsConstructor @NoArgsConstructor
@Document
public class TypeContract {


    @Id
    private String idTypeContract;
    private String nomContract;

    @DBRef
    private Offre offre;
    @DBRef
    private Cv cv;

}
