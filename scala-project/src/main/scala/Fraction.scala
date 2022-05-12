class Fraction(val fractionNumerateur: Int, fractionDenominateur: Int):
  require(fractionDenominateur != 0, "Le dénominateur ne peut être nul")

  private val plusGrandDiviseurCommun = pgcd
  private val numerateur : Int = fractionNumerateur / plusGrandDiviseurCommun
  private val denominateur: Int = fractionDenominateur / plusGrandDiviseurCommun

  override def toString : String = s"${this.numerateur}/${this.denominateur}"

  private def pgcd : Int =
    var diviseur : Int = Math.min(this.fractionNumerateur, this.fractionDenominateur)

    while this.fractionNumerateur % diviseur != 0 ||
      this.fractionDenominateur % diviseur != 0   do
      diviseur -= 1

    return diviseur

  def +(fraction: Fraction): Fraction =
    require(fraction.denominateur == this.denominateur, "Les dénominateurs ne sont pas égaux.")
    Fraction(this.numerateur + fraction.numerateur, this.denominateur)

  def -(fraction: Fraction): Fraction =
    require(fraction.denominateur == this.denominateur, "Les dénominateurs ne sont pas égaux.")
    Fraction(this.numerateur - fraction.numerateur, this.denominateur)

  def *(fraction: Fraction): Fraction =
    require(fraction.denominateur == this.denominateur, "Les dénominateurs ne sont pas égaux.")
    Fraction(this.numerateur * fraction.numerateur, this.denominateur * fraction.denominateur)
