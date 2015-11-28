package small

import scala.annotation.tailrec

object GreatestCommonDivisor {

  def main(args: Array[String]): Unit = {
    println(gcd(50,0))
  }

  //Euclidean algorithm
  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b==0) a
    else gcd(b, a%b)
  }

}
