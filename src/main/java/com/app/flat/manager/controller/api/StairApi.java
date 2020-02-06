package com.app.flat.manager.controller.api;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.CreateStairRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@RequestMapping(
        value = "/api/v1/stairs",
        consumes = APPLICATION_JSON_VALUE,
        produces = APPLICATION_JSON_VALUE)
public interface StairApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    EntityCreatedResponse create(@RequestBody @Valid CreateStairRequest request);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    void delete(@PathVariable Long id);

}
