package com.innovez.sample.core.service;

import com.innovez.sample.core.entity.Event;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author zakyalvan
 */
public interface EventService {
    Event createEvent(@NotBlank String title, String description, @NotNull Date eventDate);
}
