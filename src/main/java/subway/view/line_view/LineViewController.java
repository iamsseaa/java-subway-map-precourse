package subway.view.line_view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.StationRepository;
import subway.domain.subway.Subway;
import subway.domain.subway.SubwayRepository;

public class LineViewController {
    public static void mainView() {
        OutputLineView.printMain();
        String choice = InputLineView.askChoice();

        if (choice.equals(Constant.CHOICE_ONE)) {
            registerLine();
        }
        if (choice.equals(Constant.CHOICE_TWO)) {
            deleteLine();
        }
        if (choice.equals(Constant.CHOICE_THREE)) {
            showLineList();
        }
    }

    public static void registerLine() {
        String name = InputLineView.askLineRegister();
        Line line = new Line(name);
        LineRepository.addLine(line);
        registerStations(line);
        OutputLineView.registerLine();
    }

    public static void registerStations(Line line) {
        String upStation = InputLineView.askUpStation();
        String downStation = InputLineView.askDownStation(upStation);
        Subway subway = new Subway(line, StationRepository.getStationBySameName(upStation), StationRepository.getStationBySameName(downStation));
        SubwayRepository.addSubway(subway);
    }

    public static void deleteLine() {
        String name = InputLineView.askLineDelete();
        LineRepository.deleteLineByName(name);
        SubwayRepository.deleteSubwayByLineName(name);
        OutputLineView.deleteLine();
    }

    public static void showLineList() {
        OutputLineView.printLineList();
    }
}
