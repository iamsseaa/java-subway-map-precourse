package subway.view.line_view;

import java.util.Scanner;

public class InputLineView {
    static Scanner s = new Scanner(System.in);

    public static String askChoice() {
        String choice;
        while (true) {
            try {
                System.out.println(Constant.ASK_CHOICE);
                choice = s.nextLine();
                LineViewException.validateChoice(choice);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return choice;
    }

    public static String askLineRegister() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_LINE_REGISTER);
                name = s.nextLine();
                LineViewException.validateLineName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String askUpStation() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_UPSTATION);
                name = s.nextLine();
                LineViewException.validateStation(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String askDownStation(String upStation) {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_DOWNSTATION);
                name = s.nextLine();
                LineViewException.validateDownStation(upStation, name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String askLineDelete() {
        String name;
        while (true) {
            try {
                System.out.println(Constant.ASK_LINE_DELETE);
                name = s.nextLine();
                LineViewException.validateDeleteLineName(name);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }
}
