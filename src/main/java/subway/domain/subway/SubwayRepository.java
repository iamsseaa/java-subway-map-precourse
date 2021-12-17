package subway.domain.subway;

import subway.domain.line.Line;
import subway.domain.station.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SubwayRepository {
    static List<Subway> subways = new ArrayList<>();

    public static List<Subway> subways() {
        return Collections.unmodifiableList(subways);
    }

    public static void addSubway(Subway subway) {
        subways.add(subway);
    }

    public static boolean deleteSubwayByLineName(String name) {
        return subways.removeIf(subway -> Objects.equals(subway.getLineName(), name));
    }

    public static void addStationByLine(String lineName, Station station, int index) {
        for (Subway subway : subways) {
            if (subway.getLineName().equals(lineName)) {
                subway.addStation(station, index-1);
                break;
            }
        }
    }

    public static void deleteStationByLine(String lineName, String station) {
        for (Subway subway : subways) {
            if (subway.getLineName().equals(lineName)) {
                subway.deleteStation(station);
                break;
            }
        }
    }

    public static boolean existsLine(String name) {
        for (Subway subway : subways) {
            if (subway.isLineName(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existsStation(String name) {
        for (Subway subway : subways) {
            if (subway.isStationName(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOverMaxNumber(String lineName, int turn) {
        Subway subway = getSubwayByName(lineName);
        int maxTurn = subway.getStationNumbers();
        return maxTurn < turn;
    }

    public static Subway getSubwayByName(String lineName) {
        for (Subway subway : subways) {
            if (subway.isLineName(lineName)) {
                return subway;
            }
        }
        return null;
    }
}
