package com.github.avenderov;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    private final MessageProvider messageProvider;

    @Inject
    public HelloController(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    @ExecuteOn(TaskExecutors.IO)
    public String index() {
        LOG.info("index() invoked");

        return messageProvider.getMessage();
    }
}
