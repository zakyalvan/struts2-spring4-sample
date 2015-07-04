package com.innovez.sample.core.service;

import com.innovez.sample.core.entity.Event;
import com.innovez.sample.core.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * @author zakyalvan
 */
@Service
@Validated
@Transactional(readOnly = true)
public class JpaRepositoryEventService implements EventService {
    private static final Logger LOGGER = LoggerFactory.getLogger(JpaRepositoryEventService.class);

    @Autowired
    private EventRepository eventRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Event createEvent(String title, String description, Date eventDate) {
        LOGGER.info("Create a new event");

        Event event = new Event();
        event.setTitle(title);
        event.setDescription(description);
        event.setStartDate(eventDate);
        return eventRepository.save(event);
    }
}
