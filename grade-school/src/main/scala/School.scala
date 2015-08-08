class School {
  var gradeWithStudents = Map.empty[Int, Seq[String]]

  def add(name: String, grade: Int) = {
    val merged = gradeWithStudents.toSeq ++ Map(grade -> Seq(name)).toSeq
    val groupedByGrade = merged.groupBy(_._1)

    gradeWithStudents = groupedByGrade.mapValues(_.flatMap(_._2).toList)
  }

  def db = {
    gradeWithStudents
  }

  def grade(standard: Int) = {
    gradeWithStudents.flatMap{case (g, students) => if (g == standard) students else Seq.empty}.toSeq
  }

  def sorted = {
    gradeWithStudents.toSeq.sortBy(_._1).toMap.mapValues(_.sortWith(_ < _))
  }
}