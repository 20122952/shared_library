package com.ning

class TestDetail implements Serializable {
    public String addTestDetails(String text) {
        text = "TestDetailGroovy=" + text + "=TestDetailGroovy";
        return addTestDetailsJava(text)
    }

    String addTestDetailsJava(String text) {
        TestDetailJava test2 = new TestDetailJava()
        text = test2.addTestDetails(text)
        return text
    }
}
