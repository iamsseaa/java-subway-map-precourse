package subway.view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.domain.subway.Subway;
import subway.domain.subway.SubwayRepository;

public class PreSetting {
    static Station gyodae = new Station("교대역");
    static Station gangnam = new Station("강남역");
    static Station yeuksam = new Station("역삼역");
    static Station nambu = new Station("남부터미널역");
    static Station yangjae = new Station("양재역");
    static Station maebong = new Station("매봉역");
    static Station yangjaesimin = new Station("양재시민의숲역");

    static Line lineTwo = new Line("2호선");
    static Line lineThree = new Line("3호선");
    static Line lineShinbundang = new Line("신분당선");


    static Subway subway2 = new Subway(lineTwo, gyodae, yeuksam);
    static Subway subway3 = new Subway(lineThree, gyodae, maebong);
    static Subway subwayshin = new Subway(lineShinbundang, gangnam, yangjaesimin);

    public static void setStations() {
        StationRepository.addStation(gyodae);
        StationRepository.addStation(gangnam);
        StationRepository.addStation(yeuksam);
        StationRepository.addStation(nambu);
        StationRepository.addStation(yangjae);
        StationRepository.addStation(maebong);
        StationRepository.addStation(yangjaesimin);
    }

    public static void setLines() {
        LineRepository.addLine(lineTwo);
        LineRepository.addLine(lineThree);
        LineRepository.addLine(lineShinbundang);
    }

    public static void setSubways() {
        SubwayRepository.addSubway(subway2);
        SubwayRepository.addSubway(subway3);
        SubwayRepository.addSubway(subwayshin);
    }

    public static void setSubwayStation() {
        subway2.addStation(gangnam, 1);
        subway3.addStation(nambu, 1);
        subway3.addStation(yangjae, 2);
        subwayshin.addStation(yangjae, 1);
    }
}
