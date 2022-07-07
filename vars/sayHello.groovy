
def exe(){
    stage('Demo') {
        testname = "${env.TEST}"
        println(testname)
        com.ning.TestDetail test = new com.ning.TestDetail()
        testname = test.addTestDetails(testname)
        println(testname)
    }
}


