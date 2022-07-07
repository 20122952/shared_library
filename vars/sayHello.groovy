import com.ning.TestDetail
import com.ning.TestDetailJava

def exe(){
    stage('Demo') {
        testname = "${env.TEST}"
        println(testname)
        TestDetail test = new TestDetail()
        testname = test.addTestDetails(testname)
        println(testname)
        TestDetailJava test2 = new TestDetailJava()
        testname = test2.addTestDetails(testname)
        println(testname)
    }
}


