package subway.view.line_view;

public class Constant {
    public static final String MAIN_LINE_VIEW = "## 노선 관리 화면";

    public static final String CHOICE_ONE = "1";
    public static final String CHOICE_TWO = "2";
    public static final String CHOICE_THREE = "3";
    public static final String CHOICE_BACK = "B";
    public static final String[] CHOICES = {CHOICE_ONE, CHOICE_TWO, CHOICE_THREE, CHOICE_BACK};

    public static final String ANSWER_ONE = CHOICE_ONE + ". 노선 등록";
    public static final String ANSWER_TWO = CHOICE_TWO + ". 노선 삭제";
    public static final String ANSWER_THREE = CHOICE_THREE + ". 노선 조회";
    public static final String ANSWER_BACK = CHOICE_BACK + ". 돌아가기";

    public static final String ASK_CHOICE = "## 원하는 기능을 선택하세요.";
    public static final String ASK_LINE_REGISTER = "## 등록할 노선 이름을 입력하세요.";
    public static final String ASK_UPSTATION = "## 등록할 노선의 상행 종점역 이름을 입력하세요.";
    public static final String ASK_DOWNSTATION = "## 등록할 노선의 하행 종점역 이름을 입력하세요.";
    public static final String ASK_LINE_DELETE = "## 삭제할 노선 이름을 입력하세요.";
    public static final String ASK_LINE_LIST = "## 노선 목록";

    public static final String INFO = "[INFO] ";
    public static final String ERROR = "[ERROR] ";

    public static final String INFO_LINE_REGISTER = INFO + "지하철 노선이 등록되었습니다.";
    public static final String INFO_LINE_DELETE = INFO + "지하철 노선이 삭제되었습니다.";

    public static final String ERROR_CHOICE = ERROR + "선택할 수 없는 기능입니다.";
    public static final String ERROR_MIN_LENGTH = ERROR + "노선 이름은 최소 2글자 이상이여야 합니다.";
    public static final String ERROR_DUPLICATE = ERROR + "노선 이름이 중복됩니다.";
    public static final String ERROR_NOT_EXISTS = ERROR + "해당 노선은 존재하지 않습니다.";

    public static final String ERROR_SAME_STATION = ERROR + "상행 종점역과 하행 종점역이 같을 수 없습니다.";
}
