package com.ch.fin_demo.dto;

import com.ch.fin_demo.model.FredData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO,, Service <-> Controller <-> DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Observation {
    String date;
    Double value;

    // Entity Converter
    public static Observation fromFredData(FredData fredData) {
        return new Observation(fredData.getObservationDate(), fredData.getValue());
    }
}
