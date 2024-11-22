package org.sid.entities;//package org.sid.entities;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.time.Instant;
//
//
//@Document
//@Data @AllArgsConstructor @NoArgsConstructor
//public class Transaction {
//    @Id
//    private String id;
//    private Instant start;
//    private double price;
//    //gerer la relation entre les 2 classes
//    //on a pas utiliser un document imbriquer
//    //@DBRef //je veux une reference vers (des documents qui sont stocker dans des collections differentes)
//    //le societe qui fait la transaction
//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    @DBRef
//    private Societe societe;
//}


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.sid.entities.Societe;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "transaction")
@Data
public class Transaction {
    @Id
    private String id;
    private Instant start;
    private double price;

//    @DBRef
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Societe societe; // Reference to User document
}
