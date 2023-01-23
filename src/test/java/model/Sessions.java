package model;

public class Session {
    private String testTakerName;

    public Session(String testTakerName) {
        this.testTakerName = testTakerName;
    }

    public String getTestTakerName() {
        return testTakerName;
    }

    public void setTestTakerName(String testTakerName) {
        this.testTakerName = testTakerName;
    }

    public Session() {
    }
}
