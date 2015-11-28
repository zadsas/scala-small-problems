package small

object Sum {

  def main(args: Array[String]): Unit = {
    println(sum_v2(List(1,2,3,4,5)))
  }

  private def sum_v1(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum_v1(xs.tail)
  }

  private def sum_v2(xs: List[Int]): Int = {
    xs.reduceLeft(_+_)
  }

}
