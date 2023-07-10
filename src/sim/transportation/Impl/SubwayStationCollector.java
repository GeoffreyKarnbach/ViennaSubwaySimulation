package sim.transportation.Impl;

import sim.transportation.StationCollector;

import java.util.ArrayList;
import java.util.List;

public class SubwayStationCollector implements StationCollector {

    private List<SubwayStation> stations = new ArrayList<SubwayStation>();

    public void addStation(SubwayStation station) {
        stations.add(station);
    }

    public List<SubwayStation> getStations() {
        return stations;
    }

    public SubwayStationCollector(List<SubwayStation> stations) {
        this.stations = stations;
    }

    public String getStationName() {
        if (stations.size() == 0){
            return "DEFAULT STATION";
        }
        return stations.get(0).getStationName();
    }

    public String toString(){
        return this.getStationName();
    }
}
