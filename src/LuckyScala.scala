object LuckyScala {

  def isLucky(number: String) = {
    val sumOfDigits = (number: String) => number map (_ asDigit) sum
    val (left, right) = number splitAt number.length / 2
    sumOfDigits(left) == sumOfDigits(right)
  }

  def countLucky(min: String, max: String) : Long =
    Range.BigInt.inclusive(BigInt(min), BigInt(max), 1).count(e => isLucky(e toString))

  def countLucky(min: Long, max: Long) : Long = countLucky(min toString, max toString)
}
