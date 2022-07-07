package com.ning

class TestDetail implements Serializable {
    public String addTestDetails(String text) {
        text = "TestDetailGroovy=" + text + "=TestDetailGroovy";
        return addTestDetailsJava(text)
    }

    String addTestDetailsJava(String text) {
        TestDetailJava test2 = new TestDetailJava()
        testname = test2.addTestDetails(testname)
        return testname
    }
}
