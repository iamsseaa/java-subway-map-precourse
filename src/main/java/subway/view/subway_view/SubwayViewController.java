package subway.view.subway_view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.domain.subway.Subway;
import subway.domain.subway.SubwayRepository;

public class SubwayViewController {
    public static void mainView() {
        OutputSubwayView.printMain();
        String choice = InputSubwayView.askChoice();

        if (choice.equals(Constant.CHOICE_ONE)) {
            registerSubway();
        }
        if (choice.equals(Constant.CHOICE_TWO)) {
            deleteSubway();
        }
    }

    public static void registerSubway() {
        String lineName = InputSubwayView.askLineRegister();
        String stationName = InputSubwayView.askStationRegister();
        int turn = Integer.parseInt(InputSubwayView.askTurnRegister());

        Station station = StationRepository.getStationBySameName(stationName);
        SubwayRepository.addStationByLine(lineName, station, turn);

        OutputSubwayView.registerSubway();
    }

    public static void deleteSubway() {
        String lineName = InputSubwayView.askLineDelete();
        String stationName = InputSubwayView.askStationDelete();

        SubwayRepository.deleteStationByLine(lineName, stationName);

        OutputSubwayView.registerSubway();
    }
}
