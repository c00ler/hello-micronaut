package com.github.avenderov;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
class HelloMicronautTest {

    @Inject
    private EmbeddedApplication<?> application;

    @Test
    void shouldRunApplication() {
        assertThat(application.isRunning()).isTrue();
    }

}
