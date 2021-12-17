package subway.view.station_view;

import subway.domain.station.StationRepository;

public class StationViewException {
    public static void validateChoice(String choice) {
        for (String s : Constant.CHOICES) {
            if (s.equals(choice)) {
                return;
            }
        }
        throw new IllegalArgumentException(Constant.ERROR_CHOICE);
    }

    public static void validateStationName(String name) {
        checkMinLength(name);
        checkDuplicate(name);
    }

    public static void checkMinLength(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(Constant.ERROR_MIN_LENGTH);
        }
    }

    public static void checkDuplicate(String name) {
        if (StationRepository.existsStation(name)) {
            throw new IllegalArgumentException(Constant.ERROR_DUPLICATE);
        }
    }

    public static void validateDeleteStationName(String name) {
        checkMinLength(name);
        checkExists(name);
    }

    public static void checkExists(String name) {
        if (!StationRepository.existsStation(name)) {
            throw new IllegalArgumentException(Constant.ERROR_NOT_EXISTS);
        }
    }
}
