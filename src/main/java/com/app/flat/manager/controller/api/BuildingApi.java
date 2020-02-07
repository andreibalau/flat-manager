package com.app.flat.manager.controller.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.validation.Valid;
import java.util.List;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.BuildingResponse;
import com.app.flat.manager.controller.payload.asociation.CreateBuildingRequest;
import com.app.flat.manager.controller.payload.asociation.PreviewBuildingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@RequestMapping(
        value = "/api/v1/buildings",
        consumes = APPLICATION_JSON_VALUE,
        produces = APPLICATION_JSON_VALUE)
public interface BuildingApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    EntityCreatedResponse create(@RequestBody @Valid CreateBuildingRequest request);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    void delete(@PathVariable Long id);

    @GetMapping(value = "/{id}")
    BuildingResponse findById(@PathVariable Long id);

    @GetMapping
    List<PreviewBuildingResponse> findAll();

}
