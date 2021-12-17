package subway.view.station_view;

import java.util.Scanner;

public class InputStationView {
    static Scanner s = new Scanner(System.in);

    public static String askChoice() {
        String choice;
        while (true) {
            try {
                System.out.println(Constant.ASK_CHOICE);
                choice = s.nextLine();
                StationViewException.validateChoice(choice);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return choice;
    }

    public static String askStationRegister() {
        String name;
        while (true) {
            try{
                System.out.println(Constant.ASK_STATION_REGISTER);
                name = s.nextLine();
                StationViewException.validateStationName(name);
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
                StationViewException.validateDeleteStationName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }
}
