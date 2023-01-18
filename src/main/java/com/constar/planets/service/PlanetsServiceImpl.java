package com.constar.planets.service;

import com.constar.planets.domain.PlanetsDTO;
import com.constar.planets.repository.PlanetsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlanetsServiceImpl implements PlanetsService{

    private final PlanetsRepository planetsRepository;

    @Override
    public List<PlanetsDTO> retrieveAllPlanets() {

        return planetsRepository.retrieveAllPlanets();
    }

    @Override
    public PlanetsDTO retrievePlanet(String keyword) {
        return planetsRepository.retrievePlanet(keyword);
    }
}
