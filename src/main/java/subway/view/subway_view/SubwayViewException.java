package subway.view.subway_view;

import subway.domain.line.LineRepository;
import subway.domain.station.StationRepository;
import subway.domain.subway.SubwayRepository;
import subway.view.line_view.LineViewException;
import subway.view.station_view.StationViewException;

public class SubwayViewException {
    public static void validateChoice(String choice) {
        for (String s : Constant.CHOICES) {
            if (s.equals(choice)) {
                return;
            }
        }
        throw new IllegalArgumentException(Constant.ERROR_CHOICE);
    }

    public static void validateLineName(String name) {
        LineViewException.checkMinLength(name);
        checkNotExistsLine(name);
        checkDuplicateLine(name);
    }

    public static void validateStationName(String name) {
        StationViewException.checkMinLength(name);
        checkNotExistsStation(name);
        checkDuplicateStation(name);
    }

    public static void validateTurn(String lineName, String turn) {
        checkMinNumber(turn);
        checkMaxNumber(lineName, turn);
    }

    public static void validateDeleteLineName(String name) {
        LineViewException.checkMinLength(name);
        checkExistsLine(name);
    }

    public static void validateDeleteStationName(String name) {
        StationViewException.checkMinLength(name);
        checkExistsStation(name);
    }

    public static void checkNotExistsLine(String name) {
        if (!LineRepository.existsLine(name)) {
            throw new IllegalArgumentException(Constant.ERROR_LINE_NOT_EXISTS);
        }
    }

    public static void checkNotExistsStation(String name) {
        if (!StationRepository.existsStation(name)) {
            throw new IllegalArgumentException(Constant.ERROR_STATION_NOT_EXISTS);
        }
    }

    public static void checkDuplicateLine(String name) {
        if (SubwayRepository.existsLine(name)) {
            throw new IllegalArgumentException(Constant.ERROR_LINE_DUPLICATE);
        }
    }

    public static void checkDuplicateStation(String name) {
        if (SubwayRepository.existsStation(name)) {
            throw new IllegalArgumentException(Constant.ERROR_STATION_DUPLICATE);
        }
    }

    public static void checkMinNumber(String turn) {
        if (Integer.parseInt(turn) < 1) {
            throw new IllegalArgumentException(Constant.ERROR_MIN_NUMBER);
        }
    }

    public static void checkMaxNumber(String lineName, String turn) {
        if (SubwayRepository.isOverMaxNumber(lineName, Integer.parseInt(turn))) {
            throw new IllegalArgumentException(Constant.ERROR_MAX_NUMBER);
        }
    }

    public static void checkExistsLine(String name) {
        if (!SubwayRepository.existsLine(name)) {
            throw new IllegalArgumentException(Constant.ERROR_LINE_NOT_EXISTS);
        }
    }

    public static void checkExistsStation(String name) {
        if (!SubwayRepository.existsStation(name)) {
            throw new IllegalArgumentException(Constant.ERROR_STATION_NOT_EXISTS);
        }
    }
}
