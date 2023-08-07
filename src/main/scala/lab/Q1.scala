package lab

import scala.io.StdIn

object Q1 {
  def filterEvenNumbers(numbers:List[Int]):List[Int] = {
    numbers.filter(number => number % 2 == 0)
  }

  def main(args:Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val input = StdIn.readLine()
    val inputList = input.split(" ").map(_.toInt).toList

    val evenNumbers = filterEvenNumbers(inputList)
    println("Even number list: " + evenNumbers)
  }
}
