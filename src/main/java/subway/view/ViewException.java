package subway.view;

public class ViewException {
    public static void validateChoice(String choice) {
        if ((choice.equals(Constant.CHOICE_STATION_VIEW) )&& (choice.equals(Constant.CHOICE_LINE_VIEW))
                && (choice.equals(Constant.CHOICE_SUBWAY_VIEW)) && (choice.equals(Constant.CHOICE_PRINT_SUBWAY_VIEW))
                && (choice.equals(Constant.CHOICE_QUIT))) {
            throw new IllegalArgumentException(Constant.ERROR_CHOICE);
        }
    }
}
