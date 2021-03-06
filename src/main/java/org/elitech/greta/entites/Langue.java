package org.elitech.greta.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @AllArgsConstructor @NoArgsConstructor
@Document
public class Langue {
    @Id
    private String idLangue;
    private String nomLangue;

    @DBRef
    private Offre offre;
    @DBRef
    private Cv cv;

}
