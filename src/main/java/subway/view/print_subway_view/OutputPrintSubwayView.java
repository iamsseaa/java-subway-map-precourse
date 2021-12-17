package subway.view.print_subway_view;

import subway.domain.station.Station;
import subway.domain.subway.Subway;
import subway.domain.subway.SubwayRepository;
import subway.view.line_view.Constant;

import java.util.List;

public class OutputPrintSubwayView {
    public static final String MAIN_PRINT_SUBWAYS = "## 지하철 노선도";
    public static final String INFO = "[INFO] ";
    public static final String DELIMITER = "---";

    public static void mainView() {
        List<Subway> subways = SubwayRepository.subways();

        System.out.println(MAIN_PRINT_SUBWAYS);
        for (Subway subway : subways) {
            System.out.println(INFO + subway.getLineName());
            System.out.println(DELIMITER);
            System.out.print(INFO);
            printStations(subway.stations());
            System.out.println();
        }
    }

    public static void printStations(List<Station> stations) {
        for (Station station : stations) {
            System.out.println(station.getName());
        }
    }
}
