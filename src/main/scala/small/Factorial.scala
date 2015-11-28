package small

import scala.annotation.tailrec

object Factorial {

  def main(args: Array[String]): Unit = {
    println(factorial_v1(5))
  }

  private def factorial_v1(num: Int): Int = {
    num match {
      case 1 => 1
      case _ => num * factorial_v1(num-1)
    }
//    if (num == 1) 1
//    else num * factorial_v1(num-1)
  }

  private def factorial_v2(num: Int): Int = {
    @tailrec
    def go(acc: Int, n: Int): Int = {
      if (n==0) acc
      else go(acc*n, n-1)
    }
    go(1, num)
  }
}
