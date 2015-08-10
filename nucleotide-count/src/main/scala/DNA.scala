
class DNA(dna: String) {

  require(isValidDNA)

  private def nucleoBases = Set('A', 'T', 'C', 'G')

  def isValidDNA = (dna.toSet diff nucleoBases).isEmpty

  def count(nucleoBase: Char): Int = {
    require(nucleoBases.contains(nucleoBase))
    nucleotideCounts(nucleoBase)
  }

  def nucleotideCounts = {
    nucleoBases.map(nucleobase => nucleobase -> dna.count(_ == nucleobase)).toMap
  }
}
