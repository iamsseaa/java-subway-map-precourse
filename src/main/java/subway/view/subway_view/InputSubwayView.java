package subway.view.subway_view;

import subway.domain.subway.SubwayRepository;

import java.util.Scanner;

public class InputSubwayView {
    static Scanner s = new Scanner(System.in);
    static String lineName;

    public static String askChoice() {
        String choice;
        while (true) {
            try {
                System.out.println(Constant.ASK_CHOICE);
                choice = s.nextLine();
                SubwayViewException.validateChoice(choice);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return choice;
    }

    public static String askLineRegister() {

        while (true){
            try {
                System.out.println(Constant.ASK_LINE_REGISTER);
                lineName = s.nextLine();
                SubwayViewException.validateLineName(lineName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return lineName;
    }

    public static String askStationRegister() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_STATION_REGISTER);
                name = s.nextLine();
                SubwayViewException.validateStationName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String askTurnRegister() {
        String turn;
        while (true) {
            try {
                System.out.println(Constant.ASK_TURN_REGISTER);
                turn = s.nextLine();
                SubwayViewException.validateTurn(lineName, turn);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return turn;
    }

    public static String askLineDelete() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_LINE_DELETE);
                name = s.nextLine();
                SubwayViewException.validateDeleteLineName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String askStationDelete() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_STATION_DELETE);
                name = s.nextLine();
                SubwayViewException.validateDeleteStationName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }
}
