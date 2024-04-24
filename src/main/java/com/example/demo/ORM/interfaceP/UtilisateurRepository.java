package com.example.demo.ORM.interfaceP;

import com.example.demo.ORM.model.Credentials;
import com.example.demo.ORM.model.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
    Utilisateur findUtilisateurByNom(String nom);
    Utilisateur findUtilisateurByCredentialsRef(Credentials credentials);
}