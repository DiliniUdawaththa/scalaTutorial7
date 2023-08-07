package lab

import scala.io.StdIn

object Q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number =>number*number)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val input = StdIn.readLine()
    val inputList = input.split(" ").map(_.toInt).toList

    val squareNumbers = calculateSquare(inputList)
    println("Square number list: " + squareNumbers)
  }
}
