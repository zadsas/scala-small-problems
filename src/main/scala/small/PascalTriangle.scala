package small

object PascalTriangle {

  def main(args: Array[String]): Unit = {
    println(pascal(4,3))
  }

  // Pascal triangle 0-based coordinates
  private def pascal(row: Int, column: Int): Int = {
    if (column==0 || row==column) 1
    else (pascal(row-1, column-1) + pascal(row-1, column))
  }

}
