package Inpres.masi.backend_Authentication.ORM.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "authentication")
public class Authentication {
  @Id
  private String id;
  @Field("type")
  private String type;
  @Field("registreNational")
  private String registreNational;
  @Field("onGoing")
  private boolean onGoing;
  @Field("deviceConnexion")
  private String deviceConnexion;
  @DBRef
  private Challenge challengeRef;
  @Transient
  private String idChallenge;



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Challenge getChallengeRef() {
    return challengeRef;
  }

  public void setChallengeRef(Challenge challengeRef) {
    this.challengeRef = challengeRef;
  }


  public String getIdChallenge() {
    return idChallenge;
  }

  public void setIdChallenge(String idChallenge) {
    this.idChallenge = idChallenge;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRegistreNational() {
    return registreNational;
  }

  public void setRegistreNational(String registreNational) {
    this.registreNational = registreNational;
  }

  public boolean isOnGoing() {
    return onGoing;
  }

  public void setOnGoing(boolean onGoing) {
    this.onGoing = onGoing;
  }

  public String getDeviceConnexion() {
    return deviceConnexion;
  }

  public void setDeviceConnexion(String deviceConnexion) {
    this.deviceConnexion = deviceConnexion;
  }
}
