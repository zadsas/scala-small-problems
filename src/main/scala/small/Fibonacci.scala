package small

import scala.annotation.tailrec

object Fibonacci {

  def main(args: Array[String]): Unit = {
    println(fibonacci_v2(5))
  }

  private def fibonacci_v1(nth: Int): Int = {
    nth match {
      case 0 | 1 => 1
      case i => fibonacci_v1(nth - 1) + fibonacci_v1(nth - 2)
    }
  }

  private def fibonacci_v2(nth: Int): Int = {

    @tailrec
    def go(firstInPairGlobalIndex: Int, firstInPair: Int, secondInPair: Int): Int = nth match {
      case 0 | 1 => 1
      case `firstInPairGlobalIndex` => firstInPair
      case _ => go(firstInPairGlobalIndex + 1, secondInPair, firstInPair + secondInPair)
    }

    go(0, 0, 1)
  }

}