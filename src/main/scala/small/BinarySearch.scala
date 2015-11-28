package small

import scala.annotation.tailrec

object BinarySearch {

  def main(args: Array[String]): Unit = {
    println(binarySearch[Int](Array(1,2,3,4), 3, (x,y) => x>y))
  }

  //a binary search or half-interval search algorithm finds the position of a target value within a sorted array

  def binarySearch[A](as: Array[A], targetElem: A, gt: (A,A) => Boolean): Int = {

    @tailrec
    def go(lowIndex: Int, highIndex: Int): Int = {
      if (lowIndex > highIndex) - 1
      else {
        val midIndex = (lowIndex + highIndex) / 2
        val elemInMid = as(midIndex)
        val greater = gt(elemInMid, targetElem)
        
        if (!greater && !gt(targetElem,elemInMid)) midIndex
        else if (greater) go(lowIndex, midIndex-1)
        else go(midIndex + 1, highIndex)
      }
    }

    go(0, as.length - 1)

  }


}
