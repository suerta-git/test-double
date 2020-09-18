package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter securityCenter;
    @BeforeEach
    public void setUp() {
        DoorPanel mockDoorPanel = new MockDoorPanel();
        securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            securityCenter.switchOn();
        });
        assertEquals(exception.getMessage(), "mock");
    }
}
