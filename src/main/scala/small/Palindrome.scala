package small

import scala.annotation.tailrec

object Palindrome {

  def main(args: Array[String]): Unit = {
    println(isPalindrome_v3("ellolleh"))
  }

  private def isPalindrome_v1(msg: String) = {
    msg == msg.reverse
  }

  private def isPalindrome_v2(msg: String): Boolean = {
    msg match {
      case "" => true
      case x if x.length==1 => true
      case _ => (msg.head == msg.last) && isPalindrome_v2(msg.init.tail)
    }
  }

  private def isPalindrome_v3(msg: String): Boolean = {

    @tailrec
    def go(result: Boolean, remaining: String): Boolean = {
      remaining match {
        case "" => result
        case x if x.length == 1 => result
        case _ => go(result && remaining.head==remaining.last, remaining.init.tail)
      }
    }

    go(true, msg)
  }


}
