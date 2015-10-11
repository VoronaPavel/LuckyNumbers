trait LuckyTicket {
  def isLucky(number: String) : Boolean
  def countLucky(min: Long, max: Long) : Long
  def countLucky(min: String, max: String) : Long
}
