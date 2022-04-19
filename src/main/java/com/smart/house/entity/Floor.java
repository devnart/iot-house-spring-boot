package com.smart.house.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("floors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Floor {
    @Id
    private String id;
    private int number;

    private String houseId;

}
