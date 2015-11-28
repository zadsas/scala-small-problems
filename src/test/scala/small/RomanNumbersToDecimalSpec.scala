package small

import org.scalatest.{FlatSpec, Matchers}

class RomanNumbersToDecimalSpec extends FlatSpec with Matchers {

  "The roman number I" should "be 1" in {
    RomanNumbersToDecimal.romanToDec("I") shouldEqual(1)
  }

  "The roman number II" should "be 2" in {
    RomanNumbersToDecimal.romanToDec("II") shouldEqual(2)
  }

  "The roman number V" should "be 5" in {
    RomanNumbersToDecimal.romanToDec("V") shouldEqual(5)
  }

  "The roman number X" should "be 10" in {
    RomanNumbersToDecimal.romanToDec("X") shouldEqual(10)
  }

  "The roman number IV" should "be 4" in {
    RomanNumbersToDecimal.romanToDec("IV") shouldEqual(4)
  }

  "The roman number IX" should "be 9" in {
    RomanNumbersToDecimal.romanToDec("IX") shouldEqual(9)
  }

  "The roman number VIII" should "be 8" in {
    RomanNumbersToDecimal.romanToDec("VIII") shouldEqual(8)
  }

  "The roman number XIV" should "be 14" in {
    RomanNumbersToDecimal.romanToDec("XIV") shouldEqual(14)
  }

  "The roman number XVIII" should "be 18" in {
    RomanNumbersToDecimal.romanToDec("XVIII") shouldEqual(18)
  }

  "The roman number L" should "be 50" in {
    RomanNumbersToDecimal.romanToDec("L") shouldEqual(50)
  }

  "The roman number C" should "be 100" in {
    RomanNumbersToDecimal.romanToDec("C") shouldEqual(100)
  }

  "The roman number XL" should "be 40" in {
    RomanNumbersToDecimal.romanToDec("XL") shouldEqual(40)
  }

  "The roman number XLIV" should "be 44" in {
    RomanNumbersToDecimal.romanToDec("XLIV") shouldEqual(44)
  }

  "The roman number D" should "be 500" in {
    RomanNumbersToDecimal.romanToDec("D") shouldEqual(500)
  }

  "The roman number M" should "be 1000" in {
    RomanNumbersToDecimal.romanToDec("M") shouldEqual(1000)
  }

  "The roman number MCMIV" should "be 1904" in {
    RomanNumbersToDecimal.romanToDec("MCMIV") shouldEqual(1904)
  }

  "The roman number MCMLIV" should "be 1954" in {
    RomanNumbersToDecimal.romanToDec("MCMLIV") shouldEqual(1954)
  }

  "The roman number MCMXC" should "be 1990" in {
    RomanNumbersToDecimal.romanToDec("MCMXC") shouldEqual(1990)
  }

  "The roman number MMXIV" should "be 2014" in {
    RomanNumbersToDecimal.romanToDec("MMXIV") shouldEqual(2014)
  }

  "The roman number XXXVIII" should "be 38" in {
    RomanNumbersToDecimal.romanToDec("XXXVIII") shouldEqual(38)
  }

  "The roman number LXXXVIII" should "be 88" in {
    RomanNumbersToDecimal.romanToDec("LXXXVIII") shouldEqual(88)
  }

  "The roman number XCVIII" should "be 90" in {
    RomanNumbersToDecimal.romanToDec("XCVIII") shouldEqual(98)
  }

}
