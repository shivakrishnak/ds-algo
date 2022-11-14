package com.scala

class Car(val year: Int, var miles: Int) {
  println("creating car...")

  def this(theYear: Int) {
    this(theYear, 0)
  }
  def this(){
    this(1991, 0)
  }
}