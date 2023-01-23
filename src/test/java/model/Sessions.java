package model;

public class Sessions {
    private String testTakerName;

    public Sessions(String testTakerName) {
        this.testTakerName = testTakerName;
    }

    public String getTestTakerName() {
        return testTakerName;
    }

    public void setTestTakerName(String testTakerName) {
        this.testTakerName = testTakerName;
    }

    public Sessions() {
    }
}
