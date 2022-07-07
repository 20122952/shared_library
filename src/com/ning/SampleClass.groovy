#!/usr/bin/env groovy
package com.ning

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
