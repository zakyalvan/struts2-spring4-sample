package com.innovez.sample.core.repository;

import com.innovez.sample.core.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zakyalvan
 */
public interface EventRepository extends JpaRepository<Event, Long> {
}
