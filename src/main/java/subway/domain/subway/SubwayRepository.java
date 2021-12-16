package subway.domain.subway;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SubwayRepository {
    static List<Subway> subways = new ArrayList<>();

    public static List<Subway> subways() {
        return Collections.unmodifiableList(subways);
    }

    public static void addSubway(Subway subway) {
        subways.add(subway);
    }

    public static boolean deleteSubwayByLineName(String name) {
        return subways.removeIf(subway -> Objects.equals(subway.getSubwayLineName(), name));
    }
}
