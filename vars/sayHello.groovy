#!/usr/bin/env groovy
import com.ning.TestDetail

def exe(){
    stage('Demo') {
        testname = "${env.TEST}"
        test = new TestDetail().addTestDetails(testname)
        println(test)
    }
}


