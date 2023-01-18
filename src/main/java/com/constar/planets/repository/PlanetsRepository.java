package com.constar.planets.repository;

import com.constar.planets.domain.PlanetsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlanetsRepository {

    @Select("select * from planet")
    List<PlanetsDTO> retrieveAllPlanets();

    @Select("select * " +
            "from planet " +
            "where name like concat ('%',#{keyword},'%')")
    PlanetsDTO retrievePlanet(String keyword);
}
