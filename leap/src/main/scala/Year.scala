
case class Year(year: Int) {
  def isLeap = year match{
    case _ if year % 400 == 0 => true
    case _ if year % 100 == 0 => false
    case _                    => year % 4 == 0
  }
}
