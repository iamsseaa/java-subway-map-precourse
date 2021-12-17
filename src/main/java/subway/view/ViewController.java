package subway.view;

import subway.view.line_view.LineViewController;
import subway.view.print_subway_view.OutputPrintSubwayView;
import subway.view.station_view.StationViewController;
import subway.view.subway_view.OutputSubwayView;
import subway.view.subway_view.SubwayViewController;

import java.util.Scanner;

public class ViewController {
    static Scanner s = new Scanner(System.in);

    static boolean hasNext = true;

    public static boolean hasNext() {
        return hasNext;
    }

    public static void play() {
        mainView();
        choiceView();
    }

    public static void setPrepare() {
        PreSetting.setStations();
        PreSetting.setLines();
        PreSetting.setSubways();
        PreSetting.setSubwayStation();
    }

    public static void mainView() {
        System.out.println(Constant.MAIN);
        System.out.println(Constant.ANSWER_ONE);
        System.out.println(Constant.ANSWER_TWO);
        System.out.println(Constant.ANSWER_THREE);
        System.out.println(Constant.ANSWER_FOUR);
        System.out.println(Constant.ANSWER_QUIT);
        System.out.println();
    }

    public static void choiceView() {
        String choice;
        while (true) {
            try {
                System.out.println(Constant.ASK_MAIN_VIEW);
                choice = s.nextLine();
                ViewException.validateChoice(choice);
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if (choice.equals(Constant.CHOICE_STATION_VIEW)) {
            StationViewController.mainView();
        }
        if (choice.equals(Constant.CHOICE_LINE_VIEW)) {
            LineViewController.mainView();
        }
        if (choice.equals(Constant.CHOICE_SUBWAY_VIEW)) {
            SubwayViewController.mainView();
        }
        if (choice.equals(Constant.CHOICE_PRINT_SUBWAY_VIEW)) {
            OutputPrintSubwayView.mainView();
        }
        if (choice.equals(Constant.CHOICE_QUIT)) {
            hasNext = false;
        }
    }
}
