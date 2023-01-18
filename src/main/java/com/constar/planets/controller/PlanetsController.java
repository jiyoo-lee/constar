package com.constar.planets.controller;

import com.constar.commons.ResultDTO;
import com.constar.planets.service.PlanetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/planets")
public class PlanetsController {

    private final PlanetsService planetsService;

    @GetMapping("")
    public ResponseEntity<ResultDTO> retrieveALlPlanets() {
        ResultDTO resultDTO = new ResultDTO(true,planetsService.retrieveAllPlanets());
        return new ResponseEntity<>(resultDTO, HttpStatus.OK);
    }

    @GetMapping("/{keyword}")
    public ResponseEntity<ResultDTO> retrievePlanet(@PathVariable String keyword) {
        ResultDTO resultDTO = new ResultDTO(true,planetsService.retrievePlanet(keyword));
        return new ResponseEntity<>(resultDTO, HttpStatus.OK);
    }

}
