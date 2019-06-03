package org.elitech.greta;

import org.elitech.greta.entites.*;
import org.elitech.greta.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class GretaApplication implements CommandLineRunner {

	@Autowired
	private OffreRepository offreRepository;
	@Autowired
	private CvRepository cvRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private LangueRepository langueRepository;
	@Autowired
	private TechnologieRepository technologieRepository;
	@Autowired
	private TitrePosteRepository titrePosteRepository;
	@Autowired
	private TypeContractRepository typeContractRepository;


	public static void main(String[] args) { SpringApplication.run(GretaApplication.class, args); }

	@Override
	public void run(String... args) throws Exception {

		repositoryRestConfiguration.exposeIdsFor(Cv.class, Offre.class,TypeContract.class,
				                   Langue.class,Technologie.class,TitrePoste.class,Formation.class);


         //cvRepository.deleteAll();
		 cvRepository.save(new Cv("c1","cv developpereur",new Date(),"ile de france",
					"Langages : Programmation Orientée Objet (JAVA, J2EE), Web (HTML, CSS, JAVASCRIPT) Méthodologies : Merise, UML, Maven\n" +
					"Technologies: Web Services (Rest, SOAP), Serveurs (Tomcat, Wildfly)\n" +
					"Framework: Hibernate, Spring Boot, Spring MVC, Angular 7\n" +
					"Outils : Eclipse, Mysql\n" +
					"\n" +
					"Formations\n" +
					"\n" +
					"11/2018 - 06/2019     Titre Professionnel niveau II « Concepteur Développeur Informatique »\n" +
					"                \t         Greta MTE 93 Montreuil. \n" +
					"2005 - 2008               DUT « Informatique et Multimédia »\n" +
					"                                Université de Manouba -Tunisie. \n" +
					"\n" +
					"Expériences Professionnelles \n" +
					"\n" +
					"03/2016 - 10/2018    Responsable de l’équipe -France Dégustation - Paris 10°\n" +
					"Répartir les tâches de l’équipe, Superviser et encadrer l'activité des         équipes, contrôler l'application des règles d'hygiène, de sécurité et des procédures qualité.    \n" +
					"\n" +
					"2011 - 2015               Concepteur Informatique et Graphique (freelance) - Imprimeur Numérique\n" +
					"Prospection commerciale - rédaction du cahier des charges \n" +
					" \t\t        Conception de la  charte graphique sous Adobe Photoshop et Illustrator\n" +
					"                             Gestion de l’impression et validation de la mise en place de l’affichage\n" +
					"\n" +
					"2008 - 2011               Concepteur-Développeur web - Sté Communik -Tunisie\n" +
					"                \t         Développer les composants de l’interface avec les technologies(HTML,CSS)\n" +
					"                             Développer la persistance de données\n" +
					"                             Développer une application organisée en couche avec PHP/MySql\t    \t\n" +
					"\n" +
					"2008 - 2011               Concepteur-Développeur d’une application d’Emailing - Communik Tunisie                                             \n" +
					"Développer et intégrer une application web, concevoir le Model Conceptuel    de Données, Modéliser les différents diagrammes Développer le partie Back end \n" +
					"               \n" +
					"2007 - 2008               Concepteur Développeur d’un CD Interactif - PragmaCom Tunisie \n" +
					"                               Développer un CdRom en assurant le bon déroulement de l’animation, avec\n" +
					"            \t        Adobe Flash. \n" +
					"               \t         Simulation d’une application \n" +
					"      \t\t        Développer une simulation avec Java Swing liée à base de Données mysql.\n" +
					"\n" +
					"Langues \t\t\t\t\t\t\t\n" +
					"\n" +
					"Français : bilingue         Sport, Voyage\n" +
					"Anglais : Notion de base\n" +
					"Arabe : Langue maternelle\n" +
					"\n",   new ArrayList<>(), new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));

		 cvRepository.findAll().forEach(System.out::println);

		 System.out.println("******************************************************************************************************");
        //offreRepository.deleteAll();
		offreRepository.save(new Offre("f1","developpeur JAVA","www.indeed.com",new Date(),new Date(),"Développement JAVA JEE H/F\n" +
				 "\n" +
				 "Poste\n" +
				 "\n" +
				 "Vous intégrerez une équipe ayant la responsabilité du développement et du MCO d’une application de GRC pour un client du secteur de l’energie. Cette application permet la gestion de la relation client par les conseillers. L’application doit être disponible 24h/24 et 7j/7.\n" +
				 "Vous maitrisez les flux et bases de données techniques mis en œuvre dans le cadre des activités de développement (relecture du code, tests unitaires, gestion de exigences, couverture de code, …) Connaissance des domaines aéronautique, spatial et défense\n" +
				 "Vous êtes passionné(e) de nouvelles technologies dans les métiers du développement des systèmes d’information.\n" +
				 "Vous faites preuve d’une grande rigueur et avez une forte capacité rédactionnelle.\n" +
				 "Vous êtes ouvert(e) sur le monde, et vous appréciez de travailler en anglais dans une équipe internationale.\n" +
				 "Vous avez une bonne connaissance du langage java et de ses Framework associés\n" +
				 "Vous souhaitez travailler dans un environnement agile\n" +
				 "\n" +
				 "Technologies : Java EE, spring, springBoot, AngularJS, Angular6, Oracle 11G, SonarQube, Jenkins\n" +
				 "\n" +
				 "Profil\n" +
				 "\n" +
				 "Nous recrutons pour notre Business Line Digital des profils à fort potentiel qui seront amenés à monter en compétences sur nos projets clients.\n" +
				 "\n" +
				 "Quel profil pour nos équipes :\n" +
				 "Vous êtes issu(e) d’une formation Bac+5 en informatique ou généraliste avec une spécialisation en développement logiciel (Ecole d’ingénieur, Université ou équivalent …)\n" +
				 "Vous avez une appétence forte pour le développement de produits innovants\n" +
				 "Vous êtes organisé et disposez de capacités d’analyse et de synthèse éprouvées\n" +
				 "\n" +
				 "Quelles compétences/connaissances pour ce poste :\n" +
				 "Méthodologies Agile\n" +
				 "Qualité de code est une passion\n" +
				 "Travail en équipe\n" +
				 "Curiosité Devops\n" +
				 "\n" +
				 "Disponibilité : Le poste est à pourvoir ASAP\n" +
				 "\n" +
				 "Lieu de travail : Paris\n" +
				 "\n" +
				 "Fourchette salariale en K€ : 40k€ et 50k€*\n" +
				 "il y a 30+ jours\n" +
				 "- Continuer pour postuler",new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));


		 offreRepository.findAll().forEach(System.out::println);

		                      /**
							   * recuperéer id de offre et cv pour ajouter id offre te cv à la array titre,formation,technologie,.....
							   * parceque la base de données non Relationnels n'assure pas
							   * l'intégrite réferentiel et le relation bidirictionnel
							   * */

										Offre F1= offreRepository.findById("f1").get();
										//System.out.println("****************"+F1+"***************************");
										Cv C1=cvRepository.findById("c1").get();
		                               // System.out.println("****************"+C1+"***************************");

		 System.out.println("----------Save Titre Poste  *************************************************************************************");
		 //titrePosteRepository.deleteAll();

		 TitrePoste tp1= titrePosteRepository.save(new TitrePoste(null,"developpeur Java",F1,C1));

			F1.getTitresPostes().add(tp1);
			offreRepository.save(F1);

			C1.getTitresPostes().add(tp1);
			cvRepository.save(C1);

		 titrePosteRepository.findAll().forEach(System.out::println);


		System.out.println("----------Save Technologie  *************************************************************************************");
		//technologieRepository.deleteAll();

		Technologie tech1= technologieRepository.save(new Technologie(null,"Techolohie Java","esperience 2 ans ",F1,C1));
		F1.getTechnologies().add(tech1);
		offreRepository.save(F1);

		C1.getTechnologies().add(tech1);
		cvRepository.save(C1);

		technologieRepository.findAll().forEach(System.out::println);

		System.out.println("----------Save Formation   *************************************************************************************");
		formationRepository.deleteAll();

		Formation form1= formationRepository.save(new Formation(null,"Bac + 5 Ingénieur Informatique ",F1,C1));
		F1.getFormations().add(form1);
		offreRepository.save(F1);

		C1.getFormations().add(form1);
		cvRepository.save(C1);

		formationRepository.findAll().forEach(System.out::println);



		System.out.println("----------Save Langue   *************************************************************************************");
		//langueRepository.deleteAll();

		Langue lang1= langueRepository.save(new Langue(null,"IDF ile de france ",F1,C1));
		F1.getLangues().add(lang1);
		offreRepository.save(F1);

		C1.getLangues().add(lang1);
		cvRepository.save(C1);

		langueRepository.findAll().forEach(System.out::println);


		System.out.println("----------Save TypeContract   *************************************************************************************");
		//typeContractRepository.deleteAll();

		TypeContract typeContract1= typeContractRepository.save(new TypeContract(null,"Contract CDI",F1,C1));
		F1.getTypeContracts().add(typeContract1);
		offreRepository.save(F1);

		C1.getTypeContracts().add(typeContract1);
		cvRepository.save(C1);

		typeContractRepository.findAll().forEach(System.out::println);

	}
}
