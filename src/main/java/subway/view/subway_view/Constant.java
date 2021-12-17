package subway.view.subway_view;

public class Constant {
    public static final String MAIN_SUBWAY_VIEW = "## 노선 관리 화면";

    public static final String CHOICE_ONE = "1";
    public static final String CHOICE_TWO = "2";
    public static final String CHOICE_BACK = "B";

    public static final String ANSWER_ONE = CHOICE_ONE + ". 구간 등록";
    public static final String ANSWER_TWO = CHOICE_TWO + ". 구간 삭제";
    public static final String ANSWER_BACK = CHOICE_BACK + ". 돌아가기";
    public static final String[] CHOICES = {CHOICE_ONE, CHOICE_TWO, CHOICE_BACK};

    public static final String ASK_CHOICE = "## 원하는 기능을 선택하세요.";

    public static final String ASK_LINE_REGISTER = "## 노선을 입력하세요.";
    public static final String ASK_STATION_REGISTER = "## 역이름을 입력하세요";
    public static final String ASK_TURN_REGISTER = "## 순서를 입력하세요.";

    public static final String ASK_LINE_DELETE = "## 삭제할 구간의 노선을 입력하세요.";
    public static final String ASK_STATION_DELETE = "## 삭제할 구간의 역을 입력하세요.";

    public static final String INFO = "[INFO] ";
    public static final String ERROR = "[ERROR] ";

    public static final String INFO_SUBWAY_REGISTER = INFO + "구간이 등록되었습니다.";
    public static final String INFO_SUBWAY_DELETE = INFO + "구간이 삭제되었습니다.";

    public static final String ERROR_CHOICE = ERROR + "선택할 수 없는 기능입니다.";
    public static final String ERROR_LINE_MIN_LENGTH = ERROR + "노선 이름은 최소 2글자 이상이여야 합니다.";
    public static final String ERROR_LINE_DUPLICATE = ERROR + "해당 노선은 이미 등록되어 있습니다.";
    public static final String ERROR_LINE_NOT_EXISTS = ERROR + "해당 노선은 존재하지 않습니다.";

    public static final String ERROR_STATION_MIN_LENGTH = ERROR + "역 이름은 최소 2글자 이상이여야 합니다.";
    public static final String ERROR_STATION_DUPLICATE = ERROR + "해당 역은 이미 해당 노선에 등록되어 있습니다.";
    public static final String ERROR_STATION_NOT_EXISTS = ERROR + "해당 역은 존재하지 않습니다.";

    public static final String ERROR_MIN_NUMBER = ERROR + "입력 순서는 1부터 시작합니다.";
    public static final String ERROR_MAX_NUMBER = ERROR + "순서가 초과되었습니다.";
}
