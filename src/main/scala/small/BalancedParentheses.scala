package small

import scala.annotation.tailrec

object BalancedParentheses {

  def main(args: Array[String]): Unit = {
    val s: String = "((a+B))"
    println(isBalanced(s.toList))
  }

  def isBalanced(chars: List[Char]): Boolean = {

    @tailrec
    def _go(openedParentheses: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) openedParentheses == 0
      else
        chars.head match {
          case '(' => _go(openedParentheses + 1, chars.tail)
          case ')' => _go(openedParentheses - 1, chars.tail)
          case _ => _go(openedParentheses, chars.tail)
        }
    }

    _go(0, chars)

  }


}
