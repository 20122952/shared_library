import com.ning.TestDetail

def exe(){
    stage('Demo') {
        testname = "${env.TEST}"
        println(testname)
        TestDetail test = new TestDetail()
        testname = test.addTestDetails(testname)
        println(testname)
    }
}


