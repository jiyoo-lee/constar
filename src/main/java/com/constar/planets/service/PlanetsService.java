package com.constar.planets.service;

import com.constar.planets.domain.PlanetsDTO;

import java.util.List;

public interface PlanetsService {
    List<PlanetsDTO> retrieveAllPlanets();
    PlanetsDTO retrievePlanet(String keyword);
}
