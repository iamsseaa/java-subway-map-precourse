package subway.domain.subway;

import subway.domain.station.Station;

import javax.sound.sampled.Line;
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
}
