package org.elitech.greta.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Document
public class TitrePoste {

    @Id
    private String idTitre;
    private String nomPoste;
    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Offre offre;
    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Cv cv;

}
