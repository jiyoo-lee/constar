package com.constar.planets.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlanetsDTO {

    private String name;
    private String description;
    private Integer distanceOfEarth;
    private String imageUrl;

}
