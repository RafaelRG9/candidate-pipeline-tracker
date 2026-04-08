package com.pipeline.dao;

import java.time.LocalDate;
import java.util.Optional;

public interface PipelineDAO<T> {
    /**
     * Retrieves data for a specific date. 
     * Implementations should check the HashMap cache first for O(1) lookup.
     */
    Optional<T> getDataByDate(LocalDate date);

    /**
     * Persists or updates the data.
     * Implementations should update the HashMap cache before writing to DB.
     */
    void saveData(LocalDate date, T data);
}