#!/usr/bin/env groovy
import com.ning.TestDetail

def call(String name = 'human') {
  echo "Hello, ${name}."
  // test = env.TEST
  test = new TestDetail().addTestDetails(${name})
  println(test)
}



