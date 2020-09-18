package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem mockGradeSystem = new StubGradeSystem(Arrays.asList(80.0, 90.0, 100.0));
        GradeService gradeService = new GradeService(mockGradeSystem);
        final int whatever = 0;
        double actual = gradeService.calculateAverageGrades(whatever);
        Assertions.assertEquals(90.0, actual);
    }
}
