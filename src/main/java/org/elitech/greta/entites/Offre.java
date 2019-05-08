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

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document
public class Offre implements Serializable {

    @Id
    private String idOffre;
    private String nomOffre;
    private String source;
    private Date dateDebut;
    private Date dateAcceptation;
    private String contenuOffre;

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
        return "Offre{" +
                "idOffre='" + idOffre + '\'' +
                ", nomOffre='" + nomOffre + '\'' +
                ", source='" + source + '\'' +
                ", dateDebut='" + dateDebut + '\'' +
                ", dateAcceptation='" + dateAcceptation + '\'' +
                ", contenuOffre='" + contenuOffre + '\'' +
                '}';
    }
}


