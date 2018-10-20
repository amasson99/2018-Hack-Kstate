package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Building {
    private String buildingName;
    private final List<QuestionPool> totalPools;

    Building(String buildingName, QuestionPool... pools) {
        this.buildingName = buildingName;
        this.totalPools = new ArrayList<>(Arrays.asList(pools));
    }
}
