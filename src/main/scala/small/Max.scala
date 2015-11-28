package small

object Max {

  def main(args: Array[String]): Unit = {
    println(max_v2(List(10,100,1,40)))
  }

  private def max_v1(xs: List[Int]): Int = {
    def _max(num: Int, xs: List[Int]):Int = {
      if (xs.isEmpty) num
      else if (num>_max(xs.head, xs.tail)) num else _max(xs.head, xs.tail)
    }
    _max(xs.head, xs.tail)
  }

  private def max_v2(xs: List[Int]): Int = {
    xs.reduceLeft( (a,b) =>
      if (a>b) a
      else b
    )
  }

}
