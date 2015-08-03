
case class Year(year: Int) {
  def isLeap = year % 4 == 0 && year % 100 > 0 || year % 400 == 0
}
