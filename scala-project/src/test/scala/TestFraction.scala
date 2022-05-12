object TestFraction:

  def main(args: Array[String]): Unit =
    println("---- Début -----")

    val fractionA = Fraction(10, 1)
    val fractionB = Fraction(5, 1)

    testAddition(fractionA, fractionB)
    testSoustraction(fractionA, fractionB)
    testMultiplication(fractionA, fractionB)

    println("---- Fin -----")

  def testAddition(fractionA: Fraction, fractionB: Fraction): Unit =
    assert((fractionA + fractionB).toString == "15/1")

    println((fractionA + fractionB).toString)
    println("Test addition ✓")

  def testSoustraction(fractionA: Fraction, fractionB: Fraction): Unit =
    assert((fractionA - fractionB).toString == "5/1")

    println((fractionA - fractionB).toString)
    println("Test soustraction ✓")

  def testMultiplication(fractionA: Fraction, fractionB: Fraction): Unit =
    assert((fractionA * fractionB).toString == "50/1")

    println((fractionA * fractionB).toString)
    println("Test multiplication ✓")
  