package subway.domain.subway;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubwayRepository {
    static List<Subway> subways = new ArrayList<>();

    public static List<Subway> subways() {
        return Collections.unmodifiableList(subways);
    }
    
}
