package com.ning;

import java.io.Serializable;

public class TestDetailJava  implements Serializable {
    public String addTestDetails(String text){
        return "TestDetailJava=" + text + "=TestDetailJava";
    }
}
