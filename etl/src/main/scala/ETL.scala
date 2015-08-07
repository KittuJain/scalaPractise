
object ETL {
  def transform(old: Map[Int, Seq[String]]) = old.flatMap{
    case (num, strs) => strs.map(_.toLowerCase -> num)
  }
}
