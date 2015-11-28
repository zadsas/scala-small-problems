package small

object RomanNumbersToDecimal {

  private val charToNumber = PartialFunction[Char, Int] {
    case 'I' => 1
    case 'V' => 5
    case 'X' => 10
    case 'L' => 50
    case 'C' => 100
    case 'D' => 500
    case 'M' => 1000
  }

  def romanToDec(roman: String): Int = {
    romanToDec_v1(roman)
  }

  private def romanToDec_v1(roman: String): Int = {
    roman.toCharArray map charToNumber reduceRight ((l, r) =>
      if (l < (r - (l * 3))) r - l
      else l + r
      )
  }


}
