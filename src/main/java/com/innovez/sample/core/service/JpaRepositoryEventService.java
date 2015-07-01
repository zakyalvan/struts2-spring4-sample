package com.innovez.sample.core.service;

import com.innovez.sample.core.entity.Event;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author zakyalvan
 */
@Service
@Validated
@Transactional(readOnly = true)
public class JpaRepositoryEventService implements EventService {

}
