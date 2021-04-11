package com.github.avenderov;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static io.micronaut.http.HttpRequest.GET;
import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
class HelloMicronautTest {

//    @Inject
//    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void shouldReturnMessageFromIndex() {
        var response = client.toBlocking().retrieve(GET("/hello"));

        assertThat(response).isEqualTo("Hello, World!");
    }

}
