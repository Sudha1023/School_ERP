package com.School_ERP.repository;


import com.School_ERP.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findById(long id);
}
