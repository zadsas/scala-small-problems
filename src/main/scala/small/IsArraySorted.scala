package small

import scala.annotation.tailrec

object IsArraySorted {

  def main(args: Array[String]): Unit = {
    println(isSorted_v1[Int](Array(1,2,3,4,5), (a,b)=>a<b))
  }

  def isSorted_v1[A](col: Array[A], criteria: (A,A) => Boolean): Boolean = {

    @tailrec
    def go(index: Int): Boolean =
      if (index == col.length) true
      else if (criteria(col(index-1), col(index))) go(index+1)
      else false

    if (col.length == 0) true
    else go(1)
  }

}
