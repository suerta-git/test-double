package stub;

import java.util.List;

public class StubGradeSystem extends GradeSystem {
    private final List<Double> data;

    public StubGradeSystem(List<Double> data) {
        this.data = data;
    }

    @Override
    public List<Double> gradesFor(long studentId) {
        return data;
    }
}
