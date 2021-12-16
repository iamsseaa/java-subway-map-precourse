package subway.domain.subway;

import subway.domain.line.Line;
import subway.domain.station.Station;

import java.util.ArrayList;
import java.util.List;

public class Subway {
    Line line;
    List<Station> stations = new ArrayList<>();

    public Subway(Line line, Station upStation, Station downStation) {
        this.line = line;
        stations.add(upStation);
        stations.add(downStation);
    }

    public String getSubwayLineName() {
        return line.getName();
    }

    public void addStation(Station station, int index) {
        stations.add(index, station);
    }
}
