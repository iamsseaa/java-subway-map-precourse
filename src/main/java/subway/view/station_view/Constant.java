package subway.view.station_view;

public class Constant {
    public static final String MAIN_STATION_VIEW = "## 역 관리 화면";

    public static final String CHOICE_ONE = "1";
    public static final String CHOICE_TWO = "2";
    public static final String CHOICE_THREE = "3";
    public static final String CHOICE_BACK = "B";
    public static final String[] CHOICES = {CHOICE_ONE, CHOICE_TWO, CHOICE_THREE, CHOICE_BACK};

    public static final String ANSWER_ONE = CHOICE_ONE + ". 역 등록";
    public static final String ANSWER_TWO = CHOICE_TWO + ". 역 삭제";
    public static final String ANSWER_THREE = CHOICE_THREE + ". 역 조회";
    public static final String ANSWER_BACK = CHOICE_BACK + ". 돌아가기";

    public static final String ASK_CHOICE = "## 원하는 기능을 선택하세요.";
    public static final String ASK_STATION_REGISTER = "## 등록할 역 이름을 입력하세요.";
    public static final String ASK_STATION_DELETE = "## 삭제할 역 이름을 입력하세요.";
    public static final String ASK_STATION_LIST = "## 역 목록";

    public static final String INFO = "[INFO] ";
    public static final String ERROR = "[ERROR] ";

    public static final String INFO_STATION_REGISTER = INFO + "지하철 역이 등록되었습니다.";
    public static final String INFO_STATION_DELETE = INFO + "지하철 역이 삭제되었습니다.";

    public static final String ERROR_CHOICE = ERROR + "선택할 수 없는 기능입니다.";
    public static final String ERROR_MIN_LENGTH = ERROR + "역 이름은 최소 2글자 이상이여야 합니다.";
    public static final String ERROR_DUPLICATE = ERROR + "역 이름이 중복됩니다.";
    public static final String ERROR_NOT_EXISTS = ERROR + "해당 역은 존재하지 않습니다.";
}
