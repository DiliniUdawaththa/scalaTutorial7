package lab

import scala.io.StdIn

object Q3 {

  val isPrime:Int => Boolean = (num:Int) => {
    if(num <= 1)
      false
    else if(num <= 3)
      true
    else if(num%2 == 0 || num%3 == 0)
      false
    else{
      var i = 5
      //to check whether the number is divided by an odd number that is not multiplication of 2 & 3
      while(i * i <= num){
        if(num%i == 0 || num%(i+2)==0)
          false
        i+=6
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a list of integers separated by spaces: ")
    val input = StdIn.readLine()
    val inputList = input.split(" ").map(_.toInt).toList

    val primeNumbers = filterPrime(inputList)
    println("Prime number list: " + primeNumbers)
  }
}
