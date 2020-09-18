package mock;

public class MockDoorPanel extends DoorPanel {
    @Override
    public void close() {
        throw new RuntimeException("mock");
    }
}
