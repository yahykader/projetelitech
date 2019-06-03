package org.elitech.greta.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data @AllArgsConstructor
@NoArgsConstructor
@Document
public class Cv implements Serializable {

    @Id
    private String idCv ;
    private String nomCv;
    private Date disponibilite;
    private String mobilite;
    //wqqqprivate String nomfile;
    private String contenu;

    @DBRef
    @JsonIgnore
    @JsonIgnoreProperties
    private Collection<TitrePoste> titresPostes=new ArrayList<>();

    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Collection<Technologie> technologies=new ArrayList<>();

    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Collection<Formation> formations=new ArrayList<>();

    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Collection<Langue> langues=new ArrayList<>();

    @DBRef
    @JsonIgnore @JsonIgnoreProperties
    private Collection<TypeContract> typeContracts=new ArrayList<>();

    @Override
    public String toString() {
        return "Cv{" +
                "idCv='" + idCv + '\'' +
                ", nomCv='" + nomCv + '\'' +
                ", disponibilite='" + disponibilite + '\'' +
                ", mobilite='" + mobilite + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }
}
