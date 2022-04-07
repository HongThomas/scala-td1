object statistiques :

  def afficheTab(tab: Array[Int]) : Unit =
    for element <- tab do
      println(element)

  def indice(tab: Array[Int], v: Int) : Int =
    var estPresent = false
    var indice = -1
    for i <- 0 until tab.length
        if tab(i) == v && estPresent == false
    do
      estPresent = true
      indice = i
    indice

  def effectifTotal(tEffectifs: Array[Int]) : Int =
    var total = 0
    for element <- tEffectifs do
      total = total + element
    total

  def effectif(tValeurs: Array[Int], tEffectifs: Int, v: Int) : Int =
    return 0

  def main(args:Array[String]) : Unit =
    val temps = Array(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
    val effectifs = Array(3, 2, 2, 3, 2, 3, 4, 5, 2, 3, 1)

    println(" ---- Affichage temps ----")
    afficheTab(temps)

    println(" ---- Affichage effectifs --" +
      "--")
    afficheTab(effectifs)

    println(" ---- Affichage indice ----")
    println(indice(effectifs, 2))

    println("---- Affichage effectif total ----")
    println(effectifTotal(effectifs))

    println("---- Affichage effectif total ----")
    println(effectif(temps, effectifTotal(temps), -2))
