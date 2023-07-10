package sim.transportation.Impl;

import sim.transportation.Station;
import sim.transportation.SubwayLine;

public class SubwayStation implements Station {

    private String stationName;

    private SubwayStation nextStation;

    private SubwayStation previousStation;

    private SubwayLine lines;

    private SubwayStationCollector collector;

    public SubwayStation(String stationName,
                         SubwayStation nextStation,
                         SubwayStation previousStation,
                         SubwayLine lines) {

        this.stationName = stationName;
        this.nextStation = nextStation;
        this.previousStation = previousStation;

        this.lines = lines;
    }

    public String getStationName() {
        return stationName;
    }

    public SubwayLine getLine() {
        return lines;
    }

    public SubwayStation getNextStation() {
        return nextStation;
    }

    public void setNextStation(SubwayStation nextStation) {
        this.nextStation = nextStation;
    }

    public SubwayStation getPreviousStation() {
        return previousStation;
    }

    public void setPreviousStation(SubwayStation previousStation) {
        this.previousStation = previousStation;
    }

    public SubwayStationCollector getCollector() {
        return collector;
    }

    public void setCollector(SubwayStationCollector collector) {
        this.collector = collector;
    }
}
