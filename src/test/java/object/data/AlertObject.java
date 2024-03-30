package object.data;

import java.util.Map;

public class AlertObject {

    private String inputTextA;
    private String inputTextB;

    public AlertObject(Map<String, String> testData) {
        prepareObject(testData);

    }

    private void prepareObject(Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "inputTextA":
                    setInputTextA(testData.get(key));
                    break;
                case "inputTextB":
                    setInputTextB(testData.get(key));
                    break;
            }
        }
    }

    public String getInputTextA() {
        return inputTextA;
    }

    public void setInputTextA(String inputTextA) {
        this.inputTextA = inputTextA;
    }

    public String getInputTextB() {
        return inputTextB;
    }

    public void setInputTextB(String inputTextB) {
        this.inputTextB = inputTextB;
    }
}
