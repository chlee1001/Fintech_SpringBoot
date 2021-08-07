package com.ch.fin_demo.model.id;

import lombok.Data;

import java.io.Serializable;

@Data
public class FredId implements Serializable {

    String seriesId;
    String observationDate;
}
