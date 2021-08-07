package com.ch.fin_demo.model;

import com.ch.fin_demo.model.id.FredId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(FredId.class)
@AllArgsConstructor
@NoArgsConstructor
public class FredData {

    @Id
    String seriesId;
    @Id
    String observationDate;

    Double value;
}
