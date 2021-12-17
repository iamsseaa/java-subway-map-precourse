package subway.view.line_view;

import subway.domain.line.LineRepository;
import subway.view.station_view.StationViewException;

public class LineViewException {
    public static void validateChoice(String choice) {
        for (String s : Constant.CHOICES) {
            if (s.equals(choice)) {
                return;
            }
        }
        throw new IllegalArgumentException(Constant.ERROR_CHOICE);
    }

    public static void validateLineName(String name) {
        checkMinLength(name);
        checkDuplicate(name);
    }

    public static void validateDeleteLineName(String name) {
        checkMinLength(name);
        checkExists(name);
    }

    public static void validateStation(String name) {
        StationViewException.checkMinLength(name);
        StationViewException.checkExists(name);
    }

    public static void validateDownStation(String upStation, String downStation) {
        validateStation(downStation);
        checkSameStation(upStation, downStation);
    }

    public static void checkSameStation(String upStation, String downStation) {
        if (upStation.equals(downStation)) {
            throw new IllegalArgumentException(Constant.ERROR_SAME_STATION);
        }
    }

    public static void checkMinLength(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(Constant.ERROR_MIN_LENGTH);
        }
    }

    public static void checkDuplicate(String name) {
        if (LineRepository.existsLine(name)) {
            throw new IllegalArgumentException(Constant.ERROR_DUPLICATE);
        }
    }

    public static void checkExists(String name) {
        if (!LineRepository.existsLine(name)) {
            throw new IllegalArgumentException(Constant.ERROR_NOT_EXISTS);
        }
    }

}
