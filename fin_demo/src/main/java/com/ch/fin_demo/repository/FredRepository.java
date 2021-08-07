package com.ch.fin_demo.repository;

import com.ch.fin_demo.model.FredData;
import com.ch.fin_demo.model.id.FredId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FredRepository extends CrudRepository<FredData, FredId> {
    public List<FredData> findAllBySeriesIdAndObservationDateAfterAndObservationDateBefore(String seriesId, String from, String to);
}