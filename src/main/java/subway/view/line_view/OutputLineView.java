package subway.view.line_view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;

import java.util.List;

public class OutputLineView {
    public static void printMain() {
        System.out.println(Constant.MAIN_LINE_VIEW);
        System.out.println(Constant.ANSWER_ONE);
        System.out.println(Constant.ANSWER_TWO);
        System.out.println(Constant.ANSWER_THREE);
        System.out.println(Constant.ANSWER_BACK);
    }

    public static void registerLine() {
        System.out.println(Constant.INFO_LINE_REGISTER);
    }

    public static void deleteLine() {
        System.out.println(Constant.INFO_LINE_DELETE);
    }

    public static void printLineList() {
        List<Line> lines = LineRepository.lines();
        System.out.println(Constant.ASK_LINE_LIST);
        for (Line line : lines) {
            System.out.println(Constant.INFO + line.getName());
        }
    }
}
