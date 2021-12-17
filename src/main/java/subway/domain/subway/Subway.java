package subway.domain.subway;

import subway.domain.line.Line;
import subway.domain.station.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Subway {
    Line line;
    List<Station> stations = new ArrayList<>();

    public void addStation(Station station, int index) {
        stations.add(index, station);
    }

    public Subway(Line line, Station upStation, Station downStation) {
        this.line = line;
        stations.add(upStation);
        stations.add(downStation);
    }

    public int getStationNumbers() {
        return stations.size();
    }

    public String getLineName() {
        return line.getName();
    }

    public List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public boolean isLineName(String name) {
        return line.isName(name);
    }

    public boolean isStationName(String name) {
        for (Station station : stations) {
            if (station.isName(name)) {
                return true;
            }
        }
        return false;
    }
}
