package com.innovez.sample.web.action;

import com.innovez.sample.core.service.EventService;
import com.opensymphony.xwork2.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author zakyalvan
 */
public class CreateEvent implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateEvent.class);

    @Autowired
    private EventService eventService;

    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String execute() throws Exception {
        LOGGER.info("Handle create new event request");
        eventService.createEvent(getTitle(), getDescription(), getStartDate());
        return SUCCESS;
    }
}
