
class School {
  var schoolDB = Map.empty[Int, Seq[String]].withDefaultValue(Seq())

  def add(name: String, gradeNumber: Int) = {
    schoolDB = schoolDB.updated(gradeNumber, grade(gradeNumber) :+ name)
  }

  def db = schoolDB

  def grade(standard: Int) = schoolDB.getOrElse(standard, Seq.empty[String])

  def sorted = schoolDB.toSeq.sortBy(_._1).toMap.mapValues(_.sorted)
}
