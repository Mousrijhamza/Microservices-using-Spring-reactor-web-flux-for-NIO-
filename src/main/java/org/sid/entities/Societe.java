package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "societe")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Societe {
    @Id
    private String nom;
    private String code;
    private double price;

}
