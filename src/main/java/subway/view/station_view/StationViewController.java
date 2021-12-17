package subway.view.station_view;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;

public class StationViewController {
    public static void mainView() {
        OutputStationView.printMain();
        String choice = InputStationView.askChoice();

        if (choice.equals(Constant.CHOICE_ONE)) {
            registerStation();
        }
        if (choice.equals(Constant.CHOICE_TWO)) {
            deleteStation();
        }
        if (choice.equals(Constant.CHOICE_THREE)) {
            showStationList();
        }
    }

    public static void registerStation() {
        String name = InputStationView.askStationRegister();
        // 이름 예외 처리
        // 이름 중복 처리
        Station station = new Station(name);
        StationRepository.addStation(station);
        OutputStationView.registerStation();
    }

    public static void deleteStation() {
        String name = InputStationView.askStationDelete();
        // 이름 예외 처리
        // 이름 없으면 에러 처리 아래 boolean 이용해서
        StationRepository.deleteStation(name);
        OutputStationView.deleteStation();
    }

    public static void showStationList() {
        OutputStationView.printStationList();
    }
}
