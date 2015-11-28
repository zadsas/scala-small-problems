package small

import scala.annotation.tailrec

object FindFirstInArray {

  def main(args: Array[String]): Unit = {
//    println(findFirst_v1(Array("a", "b", "c"), "b"))
    println(findFirst_v2[String](Array("a", "b", "c"), letter => letter=="b"))
  }

  //Monomorphic findfirst
  private def findFirst_v1(col: Array[String], key: String): Int = {

    @tailrec
    def go(index: Int): Int = {
      if (index>=col.length) -1
      else if (col(index)==key) index
      else go (index+1)
    }

    go(0)
  }

  //Polymorphic or generic findfirst
  private def findFirst_v2[A](col: Array[A], p: A => Boolean): Int = {

    @tailrec
    def go(index: Int): Int = {
      if (index>=col.length) -1
      else if (p(col(index))) index
      else go (index+1)
    }

    go(0)
  }


}
