package subway.view.station_view;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;

import java.util.List;

public class OutputStationView {
    public static void printMain() {
        System.out.println(Constant.MAIN_STATION_VIEW);
        System.out.println(Constant.ANSWER_ONE);
        System.out.println(Constant.ANSWER_TWO);
        System.out.println(Constant.ANSWER_THREE);
        System.out.println(Constant.ANSWER_BACK);
    }

    public static void registerStation() {
        System.out.println(Constant.INFO_STATION_REGISTER);
    }

    public static void deleteStation() {
        System.out.println(Constant.INFO_STATION_DELETE);
    }

    public static void printStationList() {
        List<Station> stations = StationRepository.stations();
        System.out.println(Constant.ASK_STATION_LIST);
        for (Station station : stations) {
            System.out.println(Constant.INFO + station.getName());
        }
    }
}
