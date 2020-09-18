package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import stub.GradeService;
import stub.GradeSystem;
import stub.StubGradeSystem;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Mock private GradeSystem stubGradeSystem;
    GradeService gradeService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(stubGradeSystem.gradesFor(anyLong())).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        final int whatever = 0;
        double actual = gradeService.calculateAverageGrades(whatever);
        Assertions.assertEquals(90.0, actual);
    }
}
