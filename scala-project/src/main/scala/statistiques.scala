object statistiques :

  def afficheTab(tab: Array[Int]) : Unit =
    println(tab.mkString(" | "))

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

  def effectif(tValeurs: Array[Int], tEffectifs: Array[Int], v: Int) : Int =
    var effectif = -1
    for i <- 0 until tValeurs.length
      if tValeurs(i) == v
    do
      effectif = tEffectifs(i)
    return effectif

  def effectifCumuleCroissant(tValeurs: Array[Int], tEffectifs: Array[Int], v: Int) : Int =
    var ind = indice(tValeurs, v)
    var effectif = 0


    return 0

  def main(args:Array[String]) : Unit =
    val temps = Array(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
    val effectifs = Array(3, 2, 2, 3, 2, 3, 4, 5, 2, 3, 1)

    println(" Q2 ---- Affichage temps ----")
    afficheTab(temps)

    println(" Q2 ---- Affichage effectifs --" +
      "--")
    afficheTab(effectifs)

    println(" Q3 ---- Affichage indice ----")
    println(indice(effectifs, 2))

    println(" Q4 ---- Affichage effectif total ----")
    println(effectifTotal(effectifs))

    println(" Q5 ---- Affichage effectif d'une valeur ----")
    println(effectif(temps, effectifs, -2))

    println(" Q6 ---- Effectif cumule croissant ----")
    println(effectifCumuleCroissant(temps, effectifs, 0))
